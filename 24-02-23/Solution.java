
import java.io.*;
import java.util.*;

public class Solution {

    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
    public static boolean isPrime(int num) {
    if (num < 2) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

    public static void findPrimeFactors(int num) {
    for (int i = 2; i <= num; i++) {
        if (num % i == 0 && isPrime(i)) {
            System.out.print(i + " ");
        }
    }
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
        if(num<10 || num>50){
        return;
    }
    findPrimeFactors(num);


    }
}