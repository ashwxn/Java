
1   You are using lava
2     import java.io.*;
3     import java.util.*;
      class numCounti
5-       public  static void main(String args[]){
6     Scanner scanner = new Scanner(System.in);
7     int num = scanner.nextInt();
8     int i,n,count=0;
9-    for(i=1;i<=100;i++){
10-   for(n = i;n!=0;n=n/10){
11-   if(n%10  == num){
12     count++;
16    System.out.println(count);
17    }
18    }
