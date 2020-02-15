public class SLL {
    private int size;
    private SN head;
    private SN tail;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SN getHead() {
        return head;
    }

    public void setHead(SN head) {
        this.head = head;
    }

    public SN getTail() {
        return tail;
    }

    public void setTail(SN tail) {
        this.tail = tail;
    }

    public SN createSLL(int nodeValue){
        head = new SN();
        SN node = new SN();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertLL(int nodeValue,int location){
        SN node = new SN();
        node.setValue(nodeValue);
        if(head==null){
            System.out.println("LL do not exist.");
        }else if(location == 0){
            node.setNext(head);
            head = node;
        }else if(location >= size){
            tail.setNext(node);
            node.setNext(null);
            tail = node;
        }else{
            SN tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.getNext();
                index++;
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
        }
        setSize(getSize()+1);
    }

    public boolean existsSLL(){
        return head!=null;
    }

    public void traverseLL(){
        if(existsSLL()){
            SN tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.getValue());
                if(i!=getSize()-1){
                    System.out.print("->");
                }
                tempNode = tempNode.getNext();
            }
        }else{
            System.out.println("LL doesn't exist.");
        }
        System.out.println("\n");
    }

    public boolean searchSLL(int nodeValue){
        if(existsSLL()){
            SN tempNode = head;
            for(int i = 0;i<getSize();i++){
                if(tempNode.getValue() ==nodeValue){
                    System.out.println("Element found at index: "+i);
                    return true;
                }
                tempNode = tempNode.getNext();
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    public void deletionOfNode(int location){
        if(!existsSLL()){
            System.out.println("LinkedList doesn't exist.");
            return;
        }else if(location == 0){
            head = head.getNext();
            setSize(getSize()-1);
            if(getSize()==0){
                tail = null;
            }
        }else if(location >= size){
            SN tempNode = head;
            for(int i = 0;i<size-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize()-1);
        }else{
            SN tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            setSize(getSize()-1);
        }
    }

    public void middleElement(){
        int middleElement = 0;
        SN tempNode = head;
        if(!existsSLL()){
            System.out.println("L.L do not exist.");
        }else{
            for(int i=0;i<getSize()/2;i++){
                if(getSize()%2 != 0) {

                    tempNode = tempNode.getNext();
                    middleElement = tempNode.getValue();
                }else{
                    middleElement = tempNode.getNext().getValue();
                    tempNode = tempNode.getNext();
                }
            }
            System.out.println(middleElement);
        }
    }
}