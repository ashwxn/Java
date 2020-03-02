import java.util.*;
import java.io.*;
public class CSLL{
	private SN head;
	private SN tail;
	private int size;

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
	SN createCSLL(int nodeValue){
		head = new SN();
		SN node = new SN();
		node.setValue(nodeValue);
		head = node;
		tail = node;;
		size = 1;
		return head;
	}
	public void insertCSLL(int nodeValue,int location){
		SN node = new SN();
		node.setValue(nodeValue);
		System.out.println("Inserting new node at location : "+location);
		if(!existsCSLL){
			System.out.println("C.S.L.L does not exist.");
		}else if(location == 0){
			node.setNext(head);
			head = node;
			tail.setNext(node);
		}else if(location >= size){
			tail.setNext(node);
			tail = node;
			tail.setNext(head);
		}else{
			SN tempNode = head;
			for(int i = 0;i<location;i++){
				tempNode = tempNode.getNext();
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		size++;
	}
	public boolean existsCSLL(){
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
		if(!existsCSLL){
			System.out.println("S.L.L do not exist.");
		}else if(location == 0){
			head = head.getNext();
			tail.setNext(head);
			setSize(getSize()-1);
			if(getSize() == 0){
				tail = null;
			}
		}else if(location >= getSize()){
			SN tempNode = head;
			for(int i=0;i<getSize()-1;i++){
				tempNode = tempNode.getNext();
			}
			if(tempNode == head){
				tail = head = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(head);
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
	public void printHeadUsingTail(){
		if(existsCSLL){
			System.out.println(tail.getNext().getValue());
		}else{
			System.out.println("L.L does not exist.")
		}
	}
	public void deleteLinkedList() {
        System.out.println("\n\nDeleting Linked List...");
        head = null;
        if(tail == null) {
            System.out.println("Linked List is already deleted, nothing to delete !");
            return;
        }else {
            tail.setNext(null);
            tail = null;
            System.out.println("Linked List deleted successfully !");
        }
    }
    

}
