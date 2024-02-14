import java.util.Scanner;

class Area{
    float area(float radius){
        return (float)Math.PI*(radius*radius);
    }
    float area(float base, float height){
        return (float)0.5*base*height;
    }
    float area(float length, float breadth, float height){
        return length*breadth*height;
    }
}
class AreaFunctionOverload{
    public static void main(String[] args){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Area of shapes using Function Overloading\nDate : 13/02/2024\n");

        Scanner scanner = new Scanner(System.in);
        float radius, base, length, breadth, height;
        Area area = new Area();

        System.out.println("Enter the details of the circle");
        System.out.print("Radius : ");
        radius = scanner.nextFloat();
        float areaOfCircle = area.area(radius);

        System.out.println("Enter the details of the Triangle");
        System.out.print("Base : ");
        base = scanner.nextFloat();
        System.out.print("Height : ");
        height = scanner.nextFloat();
        float areaOfTriangle = area.area(base, height);

        System.out.println("Enter the details of the Box");
        System.out.print("Length : ");
        length = scanner.nextFloat();
        System.out.print("Breadth : ");
        breadth = scanner.nextFloat();
        System.out.print("Height : ");
        height = scanner.nextFloat();
        float areaOfBox = area.area(length, breadth, height);

        System.out.println("\nArea of Circle is " + areaOfCircle);
        System.out.println("Area of Triangle is " + areaOfTriangle);
        System.out.println("Area of Box is " + areaOfBox);
    }
}