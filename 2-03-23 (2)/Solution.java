import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                if (isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1)) {
                    System.out.println("true");
                    return;
                } else {
                    System.out.println("false");
                    return;
                }
            }
            i++;
            j--;
        }
        System.out.println("true");
    }

    public static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}