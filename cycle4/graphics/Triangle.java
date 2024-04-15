package graphics.util;

public class Triangle {
    double height, base;
    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }
    public void area(){
        System.out.println("Area of triangle is : " + (this.height * this.base * 0.5));
    }
}