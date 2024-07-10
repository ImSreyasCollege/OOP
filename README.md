<h1 align="center">OOP</h1>
<div align="center">Repo for Object Oriented Programming lab (sem-2)</div>

##

```
Arrays.toString(array) - converting array to string
```

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

<details>
<summary>
<h3> 3) cpu nested static and normal classes </h3> 
</summary>

```java
import java.util.Scanner;

class CPU {
        int price;
        CPU(int price) {
            this.price = price;
        } 

        class Processor {
            String core, man;

            Processor(String core, String man) {
                this.core = core;               
                this.man = man;
            }

            void display() {
                System.out.println("number of cores : " + this.core);
                System.out.println("manufacturer of the processor is : " + this.man);
            }
        }
        static class Ram {
            String size, man;

            Ram(String size, String man) {
                this.size = size;
                this.man = man;
            }

            void display() {
                System.out.println("size of the memory : " + this.size);
                System.out.println("manufacturer of the ram is : " + this.man);
            }
        }

        void display() {
            System.out.println("\nPrice of the cpu is : " + this.price);
        }
}
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Enter the price of the cpu : ");
        int price = scanner.nextInt();
        CPU cpu = new CPU(price);

        System.out.println("Enter the details of processor");
        System.out.print("no.of cores : ");
        String core = scanner.nextLine();
        if(core.equals("")) core = scanner.nextLine();
        System.out.print("manufacturer : ");
        String man = scanner.nextLine();
        if(man.equals("")) man = scanner.nextLine();

        CPU.Processor processor = cpu.new Processor(core, man);

        System.out.println("Enter details of RAM");
        System.out.print("size : ");
        String size = scanner.nextLine();
        if(size.equals("")) size = scanner.nextLine();
        System.out.print("memoryManufacturer : ");
        String memoryManufacturer = scanner.nextLine();
        if(memoryManufacturer.equals("")) memoryManufacturer = scanner.nextLine();

        CPU.Ram ram = new CPU.Ram(size, memoryManufacturer);
    
        cpu.display();
        processor.display();
        ram.display();

        scanner.close();
    }
}
```
##
</details>
