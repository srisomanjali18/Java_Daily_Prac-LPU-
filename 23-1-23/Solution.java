import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double c=(b * 1.8) + 32;
        double f=((b-32)*5)/9;
        if (a==1){
            System.out.println(Math.round(f*100.0)/100.0);
        }
        else if (a==2){
            System.out.println(Math.round(c*100.0)/100.0);
            
        }
        else{
            System.out.println("INVALID CHOICE");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}