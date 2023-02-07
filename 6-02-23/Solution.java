import java.io.*;

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0;
        int max=0;
        int min=0;
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            sum=sum+a[i];
        }
        max=a[0];
        for(int i=0;i<10;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        min=a[0];
        for(int i=0;i<10;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        int avg=(sum-max-min);
        System.out.println(avg);
    }
}