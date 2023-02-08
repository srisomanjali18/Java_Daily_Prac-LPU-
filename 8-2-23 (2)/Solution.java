import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"red","green","yellow","blue","black","white"};
        String str=sc.next();
        for(int i=0;i<6;i++){
            if(str.equals(arr[i])){
                System.out.println(i);
            }
        }
    }
}