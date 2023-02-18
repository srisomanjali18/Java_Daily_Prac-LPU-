import java.util.*;
class Solution{
    public static void main(String... arg)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1)
        {
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b+c);
        }
        else if(a == 2)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1+s2);
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}