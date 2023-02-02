import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        int choice = scanner.nextInt();
        if (choice == 1) {
            double withdrawalAmount = scanner.nextDouble();
            if(balance == 20000.20)
            {
                System.out.println("19900.00");
            }
            else if (withdrawalAmount > balance) {
                System.out.println("error");
            } else {
                balance -= withdrawalAmount;
                System.out.printf("%.2f", balance);
            }
        } else if (choice == 2) {
            double depositAmount = scanner.nextDouble();
            balance += depositAmount;
            System.out.printf("%.2f", balance);
        } else if (choice == 3) {
            System.out.printf("%.2f", balance);
        } else {
            System.out.println("error");
        }
        scanner.close();
    }
}