import graphics.util.*;
import java.util.Scanner;

class Area {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Area of different shapes using packages.\nDate : 15/04/2024\n");
        System.out.println("Enter the details of rectangle.");
        System.out.print("Height : ");
        double height = scanner.nextDouble();
        System.out.print("Width : ");
        double width = scanner.nextDouble();
        Rectangle rec = new Rectangle(height, width);

        System.out.println("Enter the details of circle.");
        System.out.print("Radius : ");
        double radius = scanner.nextDouble();
        Circle cir = new Circle(radius);

        System.out.println("Enter the details of square.");
        System.out.print("Side : ");
        double side = scanner.nextDouble();
        Square sq = new Square(side);

        System.out.println("Enter the details of Triangle.");
        System.out.print("Height : ");
        height = scanner.nextDouble();
        System.out.print("Base : ");
        double base = scanner.nextDouble();
        Triangle tr = new Triangle(height, base);

        System.out.println("");
        rec.area();
        cir.area();
        sq.area();
        tr.area();
    }
}