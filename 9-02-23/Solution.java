import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[][] = new double[n][];
        for(int i=0; i<n; i++)
        {
            int m= sc.nextInt();
            a[i] = new double[m];
        for(int j=0; j<m; j++)
        {
            a[i][j] = sc.nextDouble();
            
        }
        
    }
        int b = sc.nextInt();
        if(b<0 || b>n)
        {
            System.out.println("Invalid Input");
        
        }
        double sum =0;
        for(int i=0; i<a[b-1].length; i++)
        {
            sum += a[b-1][i];
        }
        System.out.print("Average in Subject-"+b+" is "+(sum/a[b-1].length));
    }
}