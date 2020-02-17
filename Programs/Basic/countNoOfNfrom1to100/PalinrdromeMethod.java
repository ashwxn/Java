import java.io.*;
import java.util.*;
class Palindrome{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(palindrome(num));
    }
    public static String palindrome(int n){
        int r,sum=0,temp;    
        temp=n;    
        while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;
        }
        if(temp == sum){
            return "Palindrome";
        }
        return "Not a Palindrome";
    }
}
