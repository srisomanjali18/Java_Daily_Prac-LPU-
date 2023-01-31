import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        char c1 = get.next().charAt(0);
        char c2 = get.next().charAt(0);
        
        int n1 = c1;
        int n2 = c2;
        
        if(n1 < n2 && n1 >= 65 && n1 <= 122 && n2 >= 65 && n2 <= 122)
        {
            for(int i = n1; i <= n2; i++)
            {
                System.out.print((char)(i) + " ");
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}