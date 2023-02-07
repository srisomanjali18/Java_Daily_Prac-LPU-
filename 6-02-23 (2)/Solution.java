
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