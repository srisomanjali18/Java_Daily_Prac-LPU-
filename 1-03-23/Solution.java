import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cor = sc.next();

        char arr[]=cor.toCharArray();

        int a=sc.nextInt();

        double marks=0;

        for(int i =0;i<a;i++)

        {

            String chk = sc.next();

            char arr1[]=chk.toCharArray();

            for(int j =0;j<arr1.length;j++)

            {

                if((Character.toLowerCase(arr1[j]))=='x')

                    continue;

                else if((Character.toLowerCase(arr[j]))==(Character.toLowerCase(arr1[j])))

                    marks = marks+1.0;

                else if((Character.toLowerCase(arr[j]))!=(Character.toLowerCase(arr1[j])))

                    marks=marks-0.25;

            }

            System.out.print(marks+" ");

            marks=0;

        }

    }

}