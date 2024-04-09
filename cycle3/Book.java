import java.util.Scanner;

class Publisher {
    String author, company, date;

    public Publisher(String author, String company, String date){
        this.author = author;
        this.company = company;
        this.date = date;
    }
}
class Book extends Publisher {
    String name, language;
    int price;

    public Book(String name, String language, int price, String author, String company, String date){
        super(author, company, date);
        this.name = name;
        this.language = language;
        this.price = price;
    }
}
class Literature extends Book {
    String category = "literature";
    String title;
    
    public Literature(String title, String name, String language, int price, String author, String company, String date){
        super(name, language, price, author, company, date);
        this.title = title;
    }
    void display(){
        System.out.println("Details of the book\nTitle : " + title + "\nCategory : " + category + "\nName : " + name + "\nLanguage : " + language + "\nPrice : " + price + "\nAuthor : " + author + "\nCompany : " + company + "\nDate : " + date); 
    }
}
class Fiction extends Book {
    String category = "fiction";
    String title;
    
    public Fiction(String title, String name, String language, int price, String author, String company, String date){
        super(name, language, price, author, company, date);
        this.title = title;
    }
    void display(){
        System.out.println("Details of the book\nTitle : " + title + "\nCategory : " + category + "\nName : " + name + "\nLanguage : " + language + "\nPrice : " + price + "\nAuthor : " + author + "\nCompany : " + company + "\nDate : " + date); 
    }
}
class BookMain {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of books : ");
        int MAX = scanner.nextInt();
        Literature arr1[] = new Literature[MAX];
        Fiction arr2[] = new Fiction[MAX];
        int i = 0, j = 0;
        boolean status = true;
        while(status && i+j < MAX){
            System.out.print("\nCategory of book \n1.Literature\n2.Fiction\nOR\n3.Display\n4.Exit\nChoose one : ");
            int choise = scanner.nextInt();              
            switch(choise){
                case 1 : 
                    System.out.print("\nEnter the Details of the book\nTitle : ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Name : ");
                    String name = scanner.nextLine();
                    System.out.print("Language : ");
                    String language = scanner.nextLine();
                    System.out.print("Price : ");
                    int price = scanner.nextInt();
                    System.out.print("Author : ");
                    scanner.nextLine();
                    String author = scanner.nextLine();
                    System.out.print("Publishing company : ");
                    String company = scanner.nextLine();
                    System.out.print("Date : ");
                    String date = scanner.nextLine();
                    arr1[i++] = new Literature(title, name, language, price, author, company, date);
                    break;
                case 2 : 
                    System.out.print("\nEnter the Details of the book\nTitle : ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Name : ");
                    String name = scanner.nextLine();
                    System.out.print("Language : ");
                    String language = scanner.nextLine();
                    System.out.print("Price : ");
                    int price = scanner.nextInt();
                    System.out.print("Author : ");
                    scanner.nextLine();
                    String author = scanner.nextLine();
                    System.out.print("Publishing company : ");
                    String company = scanner.nextLine();
                    System.out.print("Date : ");
                    String date = scanner.nextLine();
                    arr2[j++] = new Fiction(title, name, language, price, author, company, date);
                    break;
                case 3 : 
                    for(int k=0; k<i; k++){
                        System.out.println("\nDetials of book " + (k+1));
                        arr1[k].display();
                    }
                    for(int k=0; k<j; k++){
                        System.out.println("\nDetials of book " + (k+i+1));
                        arr2[k].display();
                    }
                case 4 : 
                    status = false;
                    break;
                default : System.out.println("Invalid choise.");
            }
        }       
    }
}