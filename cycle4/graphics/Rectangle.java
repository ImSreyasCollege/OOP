package graphics.util;

public class Rectangle {
    double height, width;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public void area(){
        System.out.println("Area of rectangle is : " + (this.height * this.width));
    }
}