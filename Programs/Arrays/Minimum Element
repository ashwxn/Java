import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedValue = readIntegers(count);
        int returnedMin = findMin(returnedValue);
        System.out.println("Minimum value present in this array is = "+returnedMin);
    }


    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter "+count+" array..");
        for(int i=0;i<array.length;i++){
            System.out.println("Enter array["+i+"] value");
           int number=scanner.nextInt();
           scanner.nextLine();
           array[i]=number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            int value = array[i];
            if(value < min){
                min = value;
            }

        }
        return min;
    }

}
