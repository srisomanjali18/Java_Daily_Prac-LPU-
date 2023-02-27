import java.util.Scanner;
class Complex{
    int real, imaginary;
    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    void Mul_Complex(Complex c1, Complex c2)
    {
        this.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        this.imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
    }
    void Display()
    {
        System.out.println(this.real+"+"+this.imaginary+"i");
    }
}
class Solution{
    public static void main(String... arg)
    {
        Scanner sc = new Scanner(System.in);
        int real = sc.nextInt();
        int imaginary = sc.nextInt();
        Complex c1 = new Complex(real, imaginary);
        real = sc.nextInt();
        imaginary = sc.nextInt();
        Complex c2 = new Complex(real, imaginary);
        Complex c3 = new Complex(0, 0);
        c3.Mul_Complex(c1, c2);
        c3.Display();
    }
}