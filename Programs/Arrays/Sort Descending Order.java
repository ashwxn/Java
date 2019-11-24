import java.util.Scanner;

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printArray(sortArray(getarraylist(scanner.nextInt())));

    }
    public static int[] getarraylist(int num){

        int[] values = new int[num];
        System.out.println("Enter the "+num+" values to be stored in the arraylist() ...");
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] values){

        //int[] arraylist = getarraylist(scanner.nextInt());
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]+"  ");
        }

    }

    //SORTING AN ARRAY

    public static int[] sortArray(int[] values){
        int[] sortedArray = new int[values.length];
        for(int i=0;i<values.length;i++){
            sortedArray[i]=values[i];
        }
        boolean flag = true;
        int temp;

        //while looping

        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length - 1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
