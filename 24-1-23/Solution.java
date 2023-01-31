import java.util.Scanner;

public class TShirtPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double GST = 18;

        if (a <= 450) {

            System.out.println("Invalid Input");

        } else {

            double result = a + (a * GST / 100);
            int b = (int) result;

            if (result == b) {
                System.out.println(b);

            } else {

                System.out.println(result);
            }
        }

    }
}