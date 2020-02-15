import java.util.LinkedList;
import java.util.Scanner;

public class Mid {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int middleElement = 0;
        int n = s.nextInt();
        do {
            list.add(s.nextInt());
            n--;
        } while (n > 0);

        for(int i=0;i<=list.size()/2;i++){
            if(n%2 == 0) {
                middleElement = list.get(i);
            }else {
                middleElement = list.get(i+1);
            }
        }
        System.out.println(middleElement);

    }
}
