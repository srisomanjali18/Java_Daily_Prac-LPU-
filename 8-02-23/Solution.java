import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(),low = Integer.MAX_VALUE;
        
        if(n < 0)
        {
            System.out.print("Invalid Array Size");
            return;
        }
        int[] arr = new int[n];
        
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] < low)
            {
                low = arr[i];
            }
        }
        
        System.out.print(low);
     }
}

