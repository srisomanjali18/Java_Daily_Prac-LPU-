import java.io.*;

import java.util.*;

import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        float s;

        double area = 0.0;

        int value = (int)area;

        if(a>0 & b>0 & c>0 )
        {
            s = (float)(a+b+c)/2;
            System.out.println(s);
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        else  {

            System.out.println((int)area);

        }
    }
}