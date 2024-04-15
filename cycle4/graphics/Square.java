package graphics.util;

public class Square {
    double side;
    public Square(double side){
        this.side = side;
    }
    public void area(){
        System.out.println("Area of square is : " + (this.side * this.side));
    }
}