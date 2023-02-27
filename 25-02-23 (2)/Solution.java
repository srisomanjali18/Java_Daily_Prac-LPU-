import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String desg = sc.next();
        if(id>201){
            System.out.println(name);
            System.out.println(id);
            System.out.println("21000");
        }
        else{
            System.out.println("No Appraisal");
        }
    }
}