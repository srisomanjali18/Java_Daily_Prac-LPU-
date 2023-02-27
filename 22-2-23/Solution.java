import java.util.Scanner;
class Circle{
    double radius;   
    double area(){
        return 3.1415926535897932*radius*radius;
    }
    double perimeter(){
        return 2*3.1415926535897932*radius;
    }
    double circumference(){
        return 2*3.1415926535897932*radius;
    }
}
class Solution{
    public static void main(String... arg)
    {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();
        obj.radius = sc.nextDouble();
        System.out.println("Area of circle:"+obj.area());
        System.out.println("Perimeter of circle:"+obj.perimeter());
        System.out.println("Circumference of circle:"+obj.circumference());
    }
}