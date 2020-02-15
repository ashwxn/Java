public class StackByLinkedList{
    SLL list;
    public StackByLinkedList(){
        list = new SLL();
    }
    public void push(int value){
        if(list.getHead() == null){
            list.createSLL(value);
        }else{
            list.insertLL(value,0);
        }
        System.out.println("Inserted value "+value+" in Stack using L.L");
    }
    public int pop(){
        int value = -1;
        if(isEmpty()){
            System.out.println("Stack underflow error !!! ");
        }else{
            value = list.getHead().getValue();
            list.deletionOfNode(0);
        }
        return value;
    }

    public boolean isEmpty(){
        if(list.getHead() == null){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        if(!isEmpty()){
            return list.getHead().getValue();
        }else{
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public void deleteStack(){
        list.setHead(null);
    }

}//EOC


