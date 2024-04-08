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
    
    public Literature(String title, String name, String language, int price, String author, String company, String date){
        super(name, language, price, author, company, date);
        this.title = title;
    }
    void display(){
        System.out.println("Details of the book\nTitle : " + title + "\nCategory : " + category + "\nName : " + name + "\nLanguage : " + language + "\nPrice : " + price + "\nAuthor : " + author + "\nCompany : " + company + "\nDate : " + date); 
    }
}
class BookMain {
    public static void main(String[] arg) {
        
    }
}