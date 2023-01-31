import java.io.*;

import java.util.*;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = Integer.parseInt(a,2);
        if(b<65 || b>90)
        {
            System.out.print("INVALID PAPER CODE");
            return;
        }
        System.out.print((char)(b));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}