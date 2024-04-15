import arithmatic.util.*;
import java.util.Scanner;

class Arithmatic {
    public static void main(String [] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Arithmatic operations using package.\nDate : 15/04/2024\n");
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values to add");
        System.out.print("a : ");
        a = scanner.nextDouble();
        System.out.print("b : ");
        b = scanner.nextDouble();
        Add add = new Add(a, b);
        add.result();

        System.out.println("\nEnter the values to substract");
        System.out.print("a : ");
        a = scanner.nextDouble();
        System.out.print("b : ");
        b = scanner.nextDouble();
        Sub sub = new Sub(a, b);
        sub.result();

        System.out.println("\nEnter the values to multiply");
        System.out.print("a : ");
        a = scanner.nextDouble();
        System.out.print("b : ");
        b = scanner.nextDouble();
        Mul mul = new Mul(a, b);
        mul.result();

        System.out.println("\nEnter the values to division");
        System.out.print("a : ");
        a = scanner.nextDouble();
        System.out.print("b : ");
        b = scanner.nextDouble();
        Div div = new Div(a, b);
        div.result();
    }
}