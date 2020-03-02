import java.io.*;
import java.util.*;
public class SLL(){
	private int size;
	private SN head;
	private SN tail;

	public SN getHead(){
		return head;
	}
	public SN getTail(){
		return tail;
	}
	public int getSize(){
		return size;
	}
	public void setHead(SN head){
		this.head = head;
	}
	public void setTail(SN tail){
		this.tail = tail;
	}
	public void setSize(int size){
		this.size = size;
	}
	public SN createSLL(int nodeValue){
		head = new SLL();
		SN node = new SN();
		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	public void insert(int nodeValue,int location){
		SN node = new SN();
		node.setValue(nodeValue);
		if(head == null){
			System.out.println("Single LinkedList doesnt exist");
			return;
		}else if(location ==0){
			node.setNext(head);
			head = node;
		}else if(location >= size){
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else{
			int index = 0;
			SN tempNode = head;
			while(index<location){
				tempNode = tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		setSize(getSize+1);
	}
	public boolean existsLL(){
		return head!=null;
	}
	public boolean searchSLL(int value){
		if(!existsLL()){
			System.out.println("S.L.L do not exist.")
			return false;
		}else{
			SN tempNode = head;
			for(int i=0;i<getSize();i++){
				if(tempNode.getValue() == value){
					System.out.println("Element found at index : "+i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("Element does not exist in the S.L.L")
			return false;
		}
		System.out.println();
	}

	public void traverse(){
		if(existsLL()){
			SN tempNode = head;
			for(int i=0;i<size;i++){
				System.out.print(tempNode.getValue());
				if(i!=getSize-1){
					System.out.print("->");
				}
				tempNode = tempNode.getNext();
			}
		}else{
			System.out.println("L.L doesnot exist.");
		}
		System.out.println("\n");
	}

	public void middleElement(){
		int middleElement = 0;
		SN tempNode = head;
		if(existsLL){
			for(int i=0;i<getSize()/2;i++){
				if(getSize%2 != 0){
					tempNode = tempNode.getNext();
					middleElement = tempNode.getValue();
				}else{
					middleElement = tempNode.getNext.getValue();
					tempNode = tempNode.getNext();
				}
			}
			System.out.println(middleElement);
		}else{
			System.out.println("S.L.L doesnot exist.");
		}
	}
	public void deletionOfNode(int location){
		if(!existsLL){
			System.out.println("S.L.L do not exist.");
		}else if(location == 0){
			head = head.getNext();
			setSize(getSize()-1);
			if(getSize() == 0){
				tail = null;
			}
		}else if(location >= getSize()){
			SN tempNode = head;
			for(int i=0;i<getSize()-1;i++){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);
		}else{
			SN tempNode = head;
			for(int i=0;i<location;i++){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize()-1);
		}
	}

}//End Of Class