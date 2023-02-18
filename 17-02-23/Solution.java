import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

                int size=s.nextInt();

                if (size<0) {

                    System.out.println("Invalid Array Size");

                    return;

                }

                int arr[]=new int[size];

                for (int i = 0; i < arr.length; i++) {

                    arr[i]=s.nextInt();

                }

                int choice=s.nextInt();

                switch (choice) {

                    case 1:

                        int x=0;

                        for (int i = 0; i < arr.length; i++) {

                            x+=arr[i];

                        }

                        System.out.println(x);

                        break;

                    case 2:

                        int y=1;

                        for (int i = 0; i < arr.length; i++) {

                            y*=arr[i];

                        }

                        System.out.println(y);

                        break;

                    default:

                    System.out.println("Wrong Choice");

                        break;

                }

    }

}