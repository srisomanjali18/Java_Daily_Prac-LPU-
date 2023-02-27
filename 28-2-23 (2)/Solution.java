import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()<=5){
            System.out.println("Invalid Input");
        }
        else{
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            int count = 1;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==arr[i+1]){
                    count++;
                }
                else{
                    System.out.print(arr[i]+""+count);
                    count = 1;
                }
            }
            System.out.print(arr[arr.length-1]+""+count);
        }
    }
}