import java.util.Scanner;

public class StackByLinkedListMain {
    public static void main(String[] args) {
        StackByLinkedList stackByLinkedList = new StackByLinkedList();
        stackByLinkedList.isEmpty();
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            stackByLinkedList.push(scanner.nextInt());
        }
        System.out.println("Popping..");
        stackByLinkedList.pop();
        System.out.println(stackByLinkedList.peek());


    }

}
