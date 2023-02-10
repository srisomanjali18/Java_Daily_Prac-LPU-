import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[7];
        // int arr1[] = new Int[n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<7; j++)
            {
            arr[j] = sc.nextInt();
                }
            int sum=0;
            for(int j=0; j<7; j++)
            {
                sum += arr[j];
            }
            if(sum == 56)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
            }
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}