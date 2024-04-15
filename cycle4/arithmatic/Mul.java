
package arithmatic.util;

public class Mul {
    double a, b;
    public Mul(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void result(){
        System.out.println(this.a + " x " + this.b + " = " + (this.a * this.b));
    }
}