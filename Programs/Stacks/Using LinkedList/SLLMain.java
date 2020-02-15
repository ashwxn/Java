import java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {
        SLL sll = new SLL();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //EnterFirstElementOfLinkedList
        sll.createSLL(scanner.nextInt());
        for(int i=0;i<n-1;i++) {
            sll.insertLL(scanner.nextInt(), scanner.nextInt());
        }
        sll.traverseLL();
        //sll.searchSLL(scanner.nextInt());
        System.out.println("Middle Element: ");
        sll.middleElement();
    }
}
//EndOfClass
