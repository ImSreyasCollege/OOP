package arithmatic.util;

public class Div {
    double a, b;
    public Div(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void result(){
        System.out.println(this.a + " / " + this.b + " = " + ((double)this.a / this.b));
    }
}