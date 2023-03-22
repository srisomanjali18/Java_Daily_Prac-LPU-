import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        if(s1.length()>=10 && s1.length()<=20 && s2.length()>=10 && s2.length()<=20)
        {
            BigInteger b3 = b1.add(b2);
            System.out.println(b3);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}