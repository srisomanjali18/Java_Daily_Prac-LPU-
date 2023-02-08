import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>2 && N<30){
            int arr[] = new int[N];
            int arr2[] = new int[N];
            for(int i=0; i<N; i++)
                arr[i]=sc.nextInt();
            if(N>2 && N<30){
                int j = 0;
                if(arr[0]!=0){
                    arr2[j++]=arr[0];
                }
                else{
                    System.out.println("Invalid Input");
                }
                for(int i=1; i<N; i++){
                    if(arr[i]!=0){
                        if(arr[i]!=arr[i-1]){
                            arr2[j++] = arr[i];
                        }
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                }
                for(int i=0; i<j; i++){
                    System.out.print(arr2[i]+" ");
                }
            }
            
        }
        else{
                System.out.println("Invalid Input");
            }
            
            
    }
}