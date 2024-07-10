<h1 align="center">OOP</h1>
<div align="center">Repo for Object Oriented Programming lab (sem-2)</div>

##

<details>
<summary>
<h3> 1) Normal nested classes </h3> 
</summary>

```java
class OuterClass {
    class InnerClass {
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
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerDisplay();
    }
}
```
##
</details>
<details>
<summary>
<h3> 2) Static nested classes </h3> 
</summary>

```java
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
```
##
</details>
