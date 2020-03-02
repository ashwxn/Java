public class CDLL {
    DN head;
    DN tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    DN createCDLL(int nodeValue){
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

    public DN getHead() {
        return head;
    }

    public void setHead(DN head) {
        this.head = head;
    }

    public DN getTail() {
        return tail;
    }

    public void setTail(DN tail) {
        this.tail = tail;
    }

    public int getLast(){
        return size;
    }

    void insertCDLL(int nodeValue, int location){
     DN node = new DN();
     node.setValue(nodeValue);
     if(!existsCDLL()){
         System.out.println("LinkedList doesn't exists.");
         return;
     }else if(location == 0){
         node.setNext(head);
         node.setPrev(tail);
         head.setPrev(node);
         tail.setNext(node);
         head = node;
     }else if(location >= size){
         node.setNext(head);
         node.setPrev(tail);
         tail.setNext(node);
         head.setPrev(node);
         tail = node;
     }else{
         DN tempNode = head;
         int index = 0;
         while(index<location-1){
             tempNode = tempNode.getNext();
         }
         node.setPrev(tempNode);
         node.setNext(tempNode.getNext());
         tempNode.setNext(node);
         node.getNext().setPrev(node);
     }size++;
    }

    public boolean existsCDLL(){
        return head!=null;
    }

    void traverseCDLL(){
        DN tempNode = head;
        if(existsCDLL()){
            for(int i=0;i<getSize();i++){
                System.out.print(tempNode.getValue());
                if(i!=getSize()-1){
                    System.out.print(" -> ");
                }
                tempNode =  tempNode.getNext();
            }
        }else{
            System.out.println("LinkedList doesn't exists.");
        }
        System.out.println("\n");
    }

    void traverseCDLLinReverse(){
        DN tempNode = tail;
        if(existsCDLL()){
            for(int i=0;i<getSize();i++){
                System.out.print(tempNode.getValue());
                if(i!=getSize()-1){
                    System.out.print(" -> ");
                }
                tempNode =  tempNode.getPrev();
            }
        }else{
            System.out.println("LinkedList doesn't exists.");
        }
        System.out.println("\n");
    }

    boolean searchCDLL(int nodeValue){
        DN tempNode = head;
        if(existsCDLL()){
            for(int i=0;i<getSize();i++){
                if(tempNode.getValue() == nodeValue ){
                    System.out.println("Element FOUND, at location : "+i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("LinkedList doesn't exists.");
        return false;
    }

    void deleteEntireCDLL(){
        System.out.println("Gonna delete the Circular Double LinkedList ");
        System.out.println("Deleting..\n...\n....");
        tail = head = null;
        tail.setNext(null);
        head.setPrev(null);
        System.out.println("Yeah ! LinkedList deleted. ");
    }

    void deleteNodeCDLL(int location){
        if(!existsCDLL()){
            System.out.println("LinkedList doesn't exist.");
            return;
        }else if(location==0){
            if(getSize()==1){
                head.setPrev(null);
                head.setNext(null);
                head = tail = null;
                setSize(getSize() - 1);
                return;
            }else{
                head = head.getNext();
                head.setPrev(null);
                tail.setNext(head);
                setSize(getSize()-1);
            }
        }else if(location >= size){
            if(getSize() == 1){
                head.setPrev(null);
                head.setNext(null);
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
            setSize(getSize() -1);
        }else{
            DN tempNode = head;
            for(int i = 0;i<location-1;i++){
                tempNode  = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            tempNode.getNext().setPrev(tempNode);
            setSize(getSize()-1);
        }
    }

}//endOfClass
