mport java.io.*;

import java.util.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a >= 1 && a<=10)
    
            {
    
                for(int i = a; i >= 1; i--)
    
                {
    
                    for(int j = 1; j <= i; j++)
    
                    {
    
                        System.out.print(j + " ");
    
                    }
    
                    System.out.println();
    
                }
    
            }
    
            else
    
            {
    
                System.out.println("Invalid Rows");
    
            }
    }
}