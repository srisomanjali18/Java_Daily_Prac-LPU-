import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter password: ");
        String password = input.nextLine();

        String convertedPassword = password.toLowerCase().replace(" ", "$");

        System.out.println( convertedPassword);
    }
}