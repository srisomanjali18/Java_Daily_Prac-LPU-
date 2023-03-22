import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        int vowelCount = 0;
        // count vowels in the first name
        for (char c : name1.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                vowelCount++;
            }
        }
        // count vowels in the second name
        for (char c : name2.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) >= 0) {
                vowelCount++;
            }
        }

        System.out.println(vowelCount);
    }
}