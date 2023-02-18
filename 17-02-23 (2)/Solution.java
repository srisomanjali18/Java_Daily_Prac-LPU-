import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

             int t =Integer.parseInt(s.nextLine());

             for (int i = 0; i < t; i++) {

                double arr[]=new double[3];

                for (int j = 0; j < 3; j++) {

                    arr[j]=s.nextDouble();

                }

                Arrays.sort(arr);

                 if (t==1)

                System.out.print((int)((arr[2]+arr[1])/2)+" ");

                 else

                     System.out.print((arr[2]+arr[1])/2+" ");

                

             }   

    }

}