public class StackByArray {
    int[] arr;
    int ToS;
    public StackByArray(int size){
        this.arr = new int[size];
        this.ToS = -1;
        System.out.println("Successfully created an empty Stack of Size: "+ size);
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow error.");
        }else{
            arr[ToS+1]=value;
            ToS++;
            System.out.println("Inserted value: "+value+" in the stack.");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow error.");
        }else{
            System.out.println("Popping value from Stack: "+arr[ToS]+" ...");
            ToS--;
        }
    }
    public boolean isEmpty(){
        if(ToS == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(ToS ==  arr.length-1){
            return true;
        }else{
            return false;
        }
    }
}//EoC
