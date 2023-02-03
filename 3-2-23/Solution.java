
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1>l2 && l1>l3)
        {
            System.out.println(l1-1);
        }
        else if(l2>l1 && l2>l3)
        {
            System.out.println(l2);
        }
        else if(l3>l1 && l3>l2)
        {
            System.out.println(l3);
        }
        else
        {
            System.out.println("-1");
        }
    }
}