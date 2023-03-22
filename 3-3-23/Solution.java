import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            String a=s.nextLine();
            String a1[]=a.split("[.]");
            if(a1.length==5){
                System.out.println(4);
            }
            else
            System.out.println(a1.length);  
    }
}