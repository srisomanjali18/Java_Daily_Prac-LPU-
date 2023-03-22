import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length() > 3){
            char ch = sc.next().charAt(0);
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            System.out.println(count);
        }
        else{
            System.out.println("Invalid");
        }
    }
}