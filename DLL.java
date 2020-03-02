public class DLL {
    DN head;
    DN tail;
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DN createDLL(int nodeValue){
    	head = new DN();
    	DN node = new DN();
    	node.setValue(nodeValue);
    	node.setNext(null);
    	node.setPrev(null);
    	head = node;
    	tail = node;
    	size = 1;
    	return head;
    }
    public void insertDLL(int nodeValue, int location){
    	DN node = new DN();
    	node.setValue(nodeValue);
    	if(!existsDLL){
    		System.out.println("D.L.L does not exists.");
    		return;
    	}else if(location == 0){
    		node.setPrev(null);
    		node.setNext(head);
    		head.setPrev(node);
    		head = node;
    	}else if(location >= size){
    		node.setNext(head);
    		tail.setNext(node);
    		node.setPrev(tail);
    		tail = node;
    	}else{
    		DN tempNode = head;
    		int index=;
    		while(index < location-1){
    			tempNode = tempNode.getNext();
    		}
    		node.setPrev(tempNode);
    		node.setNext(tempNode.getNext());
    		tempNode.setNext(node);
    		node.getNext().setPrev(node);
       	}
       	size++;
    }
    boolean existsLL(){
        return head!=null;
    }
    void traverseLL(){
        if(existsLL()){
            DN tempNode = head;
            for(int i=0;i<size;i++){
               System.out.print(tempNode.getValue());
               if(i!=size-1) {
                   System.out.print(" -> ");
               }
               tempNode=tempNode.getNext();
            }
            System.out.println("\n");
        }else{
            System.out.println("L.L doesn't exist. !! ");
        }
        System.out.println("\n");
    }

    void traverseLLinReverse(){
        if(existsLL()){
            DN tempNode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.getValue());
                if(i!= size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.getPrev();
            }
        }else {
            System.out.println("L.L doesn't exists.");
        }
        System.out.println("\n");
    }
     boolean searchNode(int nodeValue){
        if(existsLL()){
            DN tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.getValue() == nodeValue){
                    System.out.println("Element found at location: "+ i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node not found !!");
        return false;
        }

        void deleteDLL(int location) {
        if (!existsLL()) {
            System.out.println("The linked list does not exist!!");// Linked List does not exists
            return;
        } else if (location == 0) { // we want to delete first element
            if (getSize() == 1) { // if this is the only node in this list
                head = tail = null;
                setSize(getSize() - 1);
                return;
            }else {
                head = head.getNext();
                head.setPrev(null);
                tail.setNext(null);
                setSize(getSize() - 1);
            }
        } else if (location >= size) { // If location is not in range or equal, then delete last node
                            // temp node points to 2nd last node
            if(getSize() ==1){
                head.setPrev(null);
                head.setNext(null);
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            //tail = tail.getPrev();
            //tail.setNext(null);
            //.setPrev(null);
            //setSize(getSize()-1);

        } else { // if any inside node is to be deleted
            DN tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext(); // we need to traverse till we find the location
            }
            tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize() - 1);
        } // end of else

    }
    


}//End of class
