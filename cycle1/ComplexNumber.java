// Sreyas - 53
import java.util.Scanner;

public class ComplexNumber{
    public static void main(String[] arg){
        class ComplexNumberClass{
            int real;
            int img;
            public ComplexNumberClass(int r, int i) {
                this.real = r;
                this.img = i;
            }
        }
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first complex number");
        System.out.print("Real part : ");
        a=scan.nextInt();
        System.out.print("Imaginary part : ");
        b=scan.nextInt();
        ComplexNumberClass first = new ComplexNumberClass(a, b);

        System.out.println("Enter the second complex number");
        System.out.print("Real part : ");
        a=scan.nextInt();
        System.out.print("Imaginary part : ");
        b=scan.nextInt();
        ComplexNumberClass second = new ComplexNumberClass(a, b);

        int real = first.real + second.real;
        int img = first.img + second.img;
        System.out.println("Sum of the complex number is : " + real + " + " + img + "i");
    }
}