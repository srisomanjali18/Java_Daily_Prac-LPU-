import java.util.Scanner;
class Integer1{
    int[] arr;
    int sum(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    int multiplication(int[] arr)
    {
        int mul = 1;
        for(int i=0; i<arr.length; i++)
        {
            mul = mul * arr[i];
        }
        return mul;
    }
}
public class Main{
    public static void main(String... arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid Array Size");
        }
        else
        {
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int choice = sc.nextInt();
            Integer1 obj = new Integer1();
            if(choice == 1)
            {
                System.out.println(obj.sum(arr));
            }
            else if(choice == 2)
            {
                System.out.println(obj.multiplication(arr));
            }
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}