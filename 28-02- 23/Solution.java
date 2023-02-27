import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()<=2 || s2.length()<=2){
            System.out.println("Invalid Input");
        }
        else{
            int count = 0;
            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<s2.length(); j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count==s1.length()){
                System.out.println("ANAGRAM");
            }
            else{
                System.out.println("NOT ANAGRAM");
            }
        }
    }
}