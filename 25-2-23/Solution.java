import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        if (a < 5 || a > 15) {

            System.out.println("Invalid");

            scn.close();

            return;

            

        }

        int array[] = new int[a];

        for (int i = 0; i < array.length; i++) {

            int x = scn.nextInt();

            array[i] = x;

        }

        int flagh = 0;

        int array2[] = new int[a];

        int size = 0;

        for (int i = 0; i < array.length; i++) {

            int j = 0;

            while (j < size) {

                if (array[i] == array2[j]) {

                    flagh = 1;

                    break;

                }

                j++;

            }

            if (flagh == 0) {

                array2[size] = array[i];

                size++;

            }

            flagh = 0;

        }

        Arrays.sort(array2);

        int choice = scn.nextInt();

        switch (choice) {

        case 1:

            for (int h = array2.length - size; h <= array2.length - 1; h++)

                System.out.print(array2[h] + " ");

            break;

        case 2:

            for (int h = array2.length - 1; h >= array2.length - size; h--)

                System.out.print(array2[h] + " ");

            break;

        default:

            System.out.println("Invalid");

        }

        scn.close();

    }

}