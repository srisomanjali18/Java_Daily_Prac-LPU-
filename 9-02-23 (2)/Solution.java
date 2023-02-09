import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
 
        // Switch statement with int data type
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.print("8:30 " + "5:30");
                break;
                
            case "Saturday":
                System.out.print("9:30 " + "4:30");
            break;
 
       
        default:
                System.out.println("Library is closed");
        }
    }

}