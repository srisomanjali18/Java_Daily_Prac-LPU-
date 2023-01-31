import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
    int d = (int)(a+b+c)/3;
        if(a<0.0 || a>100.00 || b<0.0 || b>100.00 || c<0.0 || c>100.00)
        {
            System.out.println("invalid input");
        }
        else
        {
            System.out.println(d);
        }
    }
}