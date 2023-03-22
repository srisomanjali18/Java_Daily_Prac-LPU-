import java.util.Scanner;

public class OccurrenceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine().trim();
        String[] searchParams = sc.nextLine().trim().split(" ");
        String searchWord = searchParams[0];
        int n = Integer.parseInt(searchParams[1]);
        int occurrenceCount = 0;
        int lastOccurrenceIndex = -1;
        for (int i = 0; i < paragraph.length(); i++) {
            int index = paragraph.indexOf(searchWord, i);
            if (index == -1) {
                break;
            } else {
                occurrenceCount++;
                lastOccurrenceIndex = index;
                if (occurrenceCount == n) {
                    System.out.println(index);
                    return;
                }
                i = index;
            }
        }
        if (occurrenceCount == 0) {
            System.out.println("Not Present");
        } else {
            System.out.println(lastOccurrenceIndex);
        }
    }
}