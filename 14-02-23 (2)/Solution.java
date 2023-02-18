import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Circle
{
    double radius;
    Circle(double a)
    {
        if(a>0)
        {
            radius =a;
        }
        else if(a<0)
        {
            radius=0;
        }
    }
    double getArea()
    {
        return 3.14*radius*radius;
    }
}
class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double display[]=new double[n];
        Circle obj[]=new Circle[n];
        if(n>=1&&n<=10) {
            for (int i = 0; i < n; i++) {
                double radius = sc.nextDouble();
                if(radius>=0.1&&radius<=50)
                {
                    obj[i] = new Circle(radius);
                    display[i] = obj[i].getArea();
                }
                else
                {
                    continue;
                }
            }
            for (int i = 0; i < n; i++) {
                if (display[i] > 30) {
                    System.out.println((float)display[i]);
                }
            }
        }
    }
}