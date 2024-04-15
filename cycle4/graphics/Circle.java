package graphics.util;

public class Circle {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area of circle is : " + (this.radius * this.radius * Math.PI));
    }
}