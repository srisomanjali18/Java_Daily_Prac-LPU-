import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  a=sc.nextLong();
        int count=0;
        long b=a;
        while(a!=0){
            a=a/10;
            count++;
        }
        if(b>2147483647){
            System.out.println("Invalid Number");
        }else{
        if(b>0){
          System.out.println(count);  
        }
        else{
                      System.out.println("Invalid Number");  

        }
 
        }
    }
}

// //Alice got task from his manager to maintain 2 decks of n numbers. As he easily put n numbers in one deck but for second deck he is bit confused so help him by creating one application in which once the n numbers are entered by bob, then parallely application will copy the content in second deck also.

// Input Format

// First line will contain size In second line , enter the number as per according to size in first deck.

// Constraints

// Only integer values considered

// Output Format

// In first line , it will display the contants in actual deck. In second line , display same contents in second deck.

// Sample Input 0

// 3
// 1 2 3
// Sample Output 0

// 1 2 3
// 1 2 3


import java.io.*;


import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


public class Solution {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr1[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}































    








