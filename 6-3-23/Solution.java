import java.util.Scanner;

public class WordFormationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the words spoken by the two participants
        String word1 = sc.nextLine().trim();
        String word2 = sc.nextLine().trim();

        // Check that the words are at least 3 characters long
        if (word1.length() < 3 || word2.length() < 3) {
            System.out.println("ERROR");
            return;
        }

        // Check if the starting 3 characters of word1 match the ending 3 characters of word2 in reverse order
        if (word1.substring(0, 3).equals(new StringBuilder(word2.substring(word2.length() - 3)).reverse().toString())) {
            System.out.println("GREAT");
        } else {
            System.out.println("TRY NEXT TIME");
        }
    }
}