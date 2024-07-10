import java.util.Scanner;

class Publisher {
    String author, company, date;

    void display(){

    }
}
class Book extends Publisher {
    String name, language, price;

    void display() {

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
        System.out.println("\nname : " + this.name + "\ncategory : " + this.category + "\nlanguage : " + this.language + "\nprice : " + this.price + "\nauthor : " + this.author + "\ncompany : " + this.company + "\ndate : " + this.date);
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
        System.out.println("\nname : " + this.name + "\ncategory : " + this.category + "\nlanguage : " + this.language + "\nprice : " + this.price + "\nauthor : " + this.author + "\ncompany : " + this.company + "\ndate : " + this.date);
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
        System.out.println("Details of Literature books");
        for (int i=0; i<a; i++) {
            System.out.println("Book " + (i+1));
            arr1[i].display();
        }
        System.out.println("Details of Fiction books");
        for (int i=0; i<b; i++) {
            System.out.println("Book " + (i+1));
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