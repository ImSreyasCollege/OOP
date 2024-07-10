class OuterClass {
    static class InnerClass {
        void innerDisplay() {
            System.out.println("Message from inner class");
        }
    }
    
    void display() {
        System.out.println("Message from outer class");
    }
}
public class nestedClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.innerDisplay();
    }
}
