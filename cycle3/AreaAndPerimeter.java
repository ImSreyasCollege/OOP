import java.util.Scanner;

interface MathUtils {
    void area();
    void perimeter();
}
class Circle implements MathUtils {
    double pi = 3.141;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public void area(){
        double area = pi * radius * radius;
        System.out.println("\narea of circle : " + area);
    }
    public void perimeter(){
        double perimeter = 2 * pi * radius;
        System.out.println("perimeter of circle : " + perimeter);
    }
}
class Rectangle implements MathUtils {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void area(){
        double area = length * width;
        System.out.println("\narea of rectangle : " + area);
    }
    public void perimeter(){
        double perimeter = 2 * (length + width);
        System.out.println("perimeter of rectangle : " + perimeter);
    }
}
public class AreaAndPerimeter {
    public static void main(String [] arg){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Area and Perimeter using Interface.\nDate : 08/04/2024\n");
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while(status){
            System.out.print("\nSHAPES\n------------\n1) Rectangle\n2) Circle\n3) exit\nChoose one : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("\nEnter the details of Rectangle.");
                    System.out.print("length : ");
                    double length = scanner.nextInt();
                    System.out.print("width : ");
                    double width = scanner.nextInt();
                    Rectangle rect = new Rectangle(length, width);
                    rect.area();
                    rect.perimeter();
                    break;
                case 2:
                    System.out.println("\nEnter the details of Circle.");
                    System.out.print("radius : ");
                    double radius = scanner.nextInt();
                    Circle cir = new Circle(radius);
                    cir.area();
                    cir.perimeter();
                    break;
                case 3: 
                    status = false;
                    break;
            }
        }
        scanner.close();
    }
}
