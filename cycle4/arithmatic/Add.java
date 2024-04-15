package arithmatic.util;

public class Add {
    double a, b;
    public Add(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void result(){
        System.out.println(this.a + " + " + this.b + " = " + (this.a + this.b));
    }
}