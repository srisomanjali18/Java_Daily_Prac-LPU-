import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        if(n > 9 && n < 9999)
        {
            while(n > 0)
            {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            if(temp == rev)
            {
                System.out.println("number is palindrome");
            }
            else
            {
                System.out.println("number is not palindrome");
            }
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}