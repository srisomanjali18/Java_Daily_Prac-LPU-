import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

            int t = Integer.parseInt(s.nextLine());

            int pan=1;

            int adh=1;

            for (int i = 0; i < t; i++) {

                s.nextLine();

                String card =s.nextLine();

                s.nextLine();

                if (card.equals("P")){

                System.out.println(card+"10"+pan);

                pan++;}

                if (card.equals("A")){

                    System.out.println(card+"10"+adh);

                    adh++;

                }

            }

    }

}