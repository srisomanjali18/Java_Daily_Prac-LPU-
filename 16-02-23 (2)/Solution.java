import java.io.*;
import java.util.*;

public class Solution {
     static int toint(char x){
        int a=x-'0';
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
             String a=s.nextLine(); 
             String b=s.nextLine();
             if(a.length()>2&&b.length()>2)
             System.out.println((toint(a.charAt(0)) * toint(b.charAt(0)) - toint(a.charAt(2)) * toint(b.charAt(2))) + "+" +
             (toint(a.charAt(0)) * toint(b.charAt(2)) + toint(a.charAt(2)) * toint(b.charAt(0))) + "i");
             if(a.length()<2&&b.length()>2)
             System.out.println((toint(a.charAt(0)) * toint(b.charAt(0)) - 0 * toint(b.charAt(2))) + "+" +
             (toint(a.charAt(0)) * toint(b.charAt(2)) + 0 * toint(b.charAt(0))) + "i");
             if(a.length()>2&&b.length()<2)
             System.out.println((toint(a.charAt(0)) * toint(b.charAt(0)) - toint(a.charAt(2)) * 0 + "+" +
             (toint(a.charAt(0)) * 0 + toint(a.charAt(2)) * toint(b.charAt(0))) + "i"));
    }
}