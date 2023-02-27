import java.io.*;
import java.util.*;
class Employee{
    int id;
    int age;
    Employee(int id,int age){
        this.id=id;
        this.age=age;
        
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                int a =s.nextInt();
                if(a<1){
                    System.out.println("Invalid input");
                    return;
                }
                Employee E[]=new Employee[a];
                for (int i = 0; i < a; i++) {
                    int x,y;
                    x=s.nextInt();
                    y=s.nextInt();
                    if(x>=10&&x<=1000&&y>=18&&y<=50){
                    E[i]=new Employee(x, y);
                    }
                    else{
                        System.out.println("Invalid data");
                        return;
                    }
                }
                for (int i = 0; i < E.length; i++) {
                    Employee e=E[i];
                    if(e.age<30){
                        System.out.println(e.id+" "+e.age);
                    }
                }
}
}