import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size < 0) {
            System.out.println("Invalid Array Size");
        } else {
            double[] arr = new double[size];
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextDouble();
            }
            int[] arr1 = new int[size];
            for(int i = 0; i < size; i++) {
                if(arr[i] < 0) {
                    System.out.println("Invalid Array Elements");
                    break;
                } else {
                    arr1[i] = (int)arr[i];
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}