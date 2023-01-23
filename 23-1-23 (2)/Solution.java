import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int c = b % 10;
        b /= 10;
        
        if(b == 0)
               
        {
            System.out.println("invalid input");
            System.exit(0);
        }
        int d = b % 10;
        b /= 10;
        if (b != 0) {
            System.out.println("invalid input");
            System.exit(0);
        }
        
        int e = c + d;
        int f = c * d;
        
        if ((e + f) == a)
            System.out.println("special two digit number");
        else
            System.out.println("not a special two digit number");
            
    }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }