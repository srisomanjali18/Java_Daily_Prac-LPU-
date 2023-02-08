import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[4];
        String arr1[]=new String[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<4;i++){
            arr1[i]=sc.next();
        }
        int count=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i].equals(arr1[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

