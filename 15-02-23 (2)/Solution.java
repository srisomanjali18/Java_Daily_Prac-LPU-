import java.io.*;
import java.util.*;

public class Solution {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 if(n < 1 || n > 2){
 System.out.print("ERROR");
 return;
 }
 else if(n ==1){
 
 int a = sc.nextInt();
 int b = sc.nextInt();
 System.out.print(a + b);
 }
 else{
 String a1 = sc.next();
 String b1 = sc.next();
 if(a1.length()<b1.length()) 
 System.out.print(a1+" "+b1); 
 
 else{
 System.out.print(a1+b1);
 }
 }
 }
}