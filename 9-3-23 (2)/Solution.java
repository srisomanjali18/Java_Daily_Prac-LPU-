import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        if(n>10)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            String[] arr = s.split(" ");
            int count = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].length()==n)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}