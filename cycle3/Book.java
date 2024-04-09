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
    
    public Literature(String name, String language, int price, String author, String company, String date){
        super(name, language, price, author, company, date);
    }
    void display(){
        System.out.println("\nName : " + name + "\nCategory : " + category + "\nLanguage : " + language + "\nPrice : " + price + "\nAuthor : " + author + "\nCompany : " + company + "\nDate : " + date); 
    }
}
class Fiction extends Book {
    String category = "fiction";
    String title;
    
    public Fiction(String name, String language, int price, String author, String company, String date){
        super(name, language, price, author, company, date);
    }
    void display(){
        System.out.println("\nName : " + name + "\nCategory : " + category + "\nLanguage : " + language + "\nPrice : " + price + "\nAuthor : " + author + "\nCompany : " + company + "\nDate : " + date); 
    }
}
class BookMain {
    public static void main(String[] arg) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Details of Book.\nDate : 06/04/2024\n");
        Scanner scanner = new Scanner(System.in);
        String name, language, author, company, date;
        int price;
        System.out.print("Enter the total number of books : ");
        int MAX = scanner.nextInt();
        Literature arr1[] = new Literature[MAX];
        Fiction arr2[] = new Fiction[MAX];
        int i = 0, j = 0;
        boolean status = true;
        while(status && i+j < MAX){
            System.out.print("\nCATEGORY\n---------------\n1)Literature\n2)Fiction\n\nOPERATIONS\n---------------\n3)Display\n4)Exit\nChoose one : ");
            int choice = scanner.nextInt();              
            switch(choice){
                case 1 : 
                    System.out.println("\nEnter the Details of the book " + (i+j+1));
                    System.out.print("Name : ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.print("Language : ");
                    language = scanner.nextLine();
                    System.out.print("Price : ");
                    price = scanner.nextInt();
                    System.out.print("Author : ");
                    scanner.nextLine();
                    author = scanner.nextLine();
                    System.out.print("Publishing company : ");
                    company = scanner.nextLine();
                    System.out.print("Date : ");
                    date = scanner.nextLine();
                    arr1[i++] = new Literature(name, language, price, author, company, date);
                    break;
                case 2 : 
                    System.out.println("\nEnter the Details of the book " + (i+j+1));
                    System.out.print("Name : ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.print("Language : ");
                    language = scanner.nextLine();
                    System.out.print("Price : ");
                    price = scanner.nextInt();
                    System.out.print("Author : ");
                    scanner.nextLine();
                    author = scanner.nextLine();
                    System.out.print("Publishing company : ");
                    company = scanner.nextLine();
                    System.out.print("Date : ");
                    date = scanner.nextLine();
                    arr2[j++] = new Fiction(name, language, price, author, company, date);
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
                    break;
                case 4 : 
                    status = false;
                    break;
                default : System.out.println("Invalid choise.");
            }
        }       
        if((i+j) >= MAX){
            for(int k=0; k<i; k++){
                System.out.println("\nDetials of book " + (k+1));
                arr1[k].display();
            }
            for(int k=0; k<j; k++){
                System.out.println("\nDetials of book " + (k+i+1));
                arr2[k].display();
            }
        }
        scanner.close();
    }
}