import java.util.Scanner;

public class StackByArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        StackByArray stack = new StackByArray(size);
        for(int i=0;i<size;i++) {
            stack.push(scanner.nextInt());
        }

    }
}
