import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
        }
        System.out.println(String.join("#", arr));
    }
}