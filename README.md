<h1 align="center">OOP</h1>
<div align="center">Repo for Object Oriented Programming lab (sem-2)</div>

##

```java
Arrays.toString(array) // converting array to string
Arrays.deepToString(array) // converting 2D array to string
Arrays.fill(array, value) // array will be filled with given value
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

<details>
<summary>
<h3> 4) Book </h3> 
</summary>

```java
import java.util.Scanner;

class Publisher {
    String author, company, date;

    void display(){
        System.out.println("author : " + this.author);
        System.out.println("company : " + this.company);
        System.out.println("date : " + this.date);
    }
}
class Book extends Publisher {
    String name, language, price;

    void display() {
        System.out.println("\nname : " + this.name);
        System.out.println("language : " + this.language);
        System.out.println("price : " + this.price);
        super.display();
    }
}
class Literature extends Book {
    String category = "Literature";

    Literature(String name, String language, String price, String author, String company, String date) {
        this.name = name;
        this.language = language;
        this.price = price;
        this.author = author;
        this.company = company;
        this.date = date;
    }
    void display() {
        super.display();
        System.out.println("category : " + this.category);
    }
}
class Fiction extends Book {
    String category = "Fiction";

    Fiction(String name, String language, String price, String author, String company, String date) {
        this.name = name;
        this.language = language;
        this.price = price;
        this.author = author;
        this.company = company;
        this.date = date;
    }

    void display() {
        super.display();
        System.out.println("category : " + this.category);
    }
}
public class Test {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no.of Literature books : ");
        int a = scanner.nextInt();
        Book[] arr1 = new Book[a];
        System.out.print("Enter the no.of Fiction books : ");
        int b = scanner.nextInt();
        Book[] arr2 = new Book[b];
        System.out.println("Enter the details of Literature books");
        for (int i=0; i<a; i++) {
            System.out.println("Book " + (i+1));
            arr1[i] = createBook("Literature", scanner);
        }
        System.out.println("\nEnter the details of Fiction books");
        for (int i=0; i<b; i++) {
            System.out.println("Book " + (i+1));
            arr2[i] = createBook("Fiction", scanner);
        }
        System.out.println("\nDetails of Literature books");
        for (int i=0; i<a; i++) {
            System.out.println("\nBook " + (i+1));
            arr1[i].display();
        }
        System.out.println("\nDetails of Fiction books");
        for (int i=0; i<b; i++) {
            System.out.println("\nBook " + (i+1));
            arr2[i].display();
        }

        scanner.close();
    }
    static Book createBook(String type, Scanner scanner) {

        System.out.print("name : ");
        String name = scanner.nextLine();
        if(name.isEmpty()) name = scanner.nextLine();

        System.out.print("language : ");
        String language = scanner.nextLine();
        if(language.isEmpty()) language = scanner.nextLine();

        System.out.print("price : ");
        String price = scanner.nextLine();
        if(price.isEmpty()) price = scanner.nextLine();
        
        System.out.print("author : ");
        String author = scanner.nextLine();
        if(author.isEmpty()) author = scanner.nextLine();

        System.out.print("company : ");
        String company = scanner.nextLine();
        if(company.isEmpty()) company = scanner.nextLine();

        System.out.print("date : ");
        String date = scanner.nextLine();
        if(date.isEmpty()) date = scanner.nextLine();

        if(type.equals("Literature")) {
            return new Literature(name, language, price, author, company, date);
        } else if(type.equals("Fiction")) {
            return new Fiction(name, language, price, author, company, date);
        } else {
            return null;
        }
    }
}
```
##
</details>