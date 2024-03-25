import java.util.Scanner;

class Complex{
    int img;
    int real;
    public Complex(int real, int img){
        this.real = real;
        this.img = img;
    }
}

class Main{
    public static void main(String []args){
        int real, img;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex number");
        System.out.print("Enter the real part : ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginary part : ");
        img = scanner.nextInt();
        Complex firstNumber = new Complex(real, img);               

        System.out.println("Enter the second complex number");
        System.out.print("Enter the real part : ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginary part : ");
        img = scanner.nextInt();
        Complex secondNumber = new Complex(real, img);               

        System.out.println("Sum : "+ (firstNumber.real + secondNumber.real) + " + " +(firstNumber.img + secondNumber.img) + "i");
    }
}
