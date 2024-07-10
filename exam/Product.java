import java.util.Scanner;

class Product {
    String name, code;
    int price;

    Product(String name, String code, int price){
        this.name = name;
        this.code = code;
        this.price = price;
    }
    void display() {
        System.out.println("Name of the product : " + this.name);
        System.out.println("Code of the product : " + this.code);
        System.out.println("Price of the product : " + this.price);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details of product 1");
        System.out.print("name : ");
        String name1 = scanner.nextLine();
        if (name1.equals("")) name1 = scanner.nextLine();
        System.out.print("code : ");
        String code1 = scanner.nextLine();
        if (code1.equals("")) code1 = scanner.nextLine();
        System.out.print("price : ");
        int price1 = scanner.nextInt();

        System.out.println("Enter details of product 2");
        System.out.print("name : ");
        String name2 = scanner.nextLine();
        if (name2.equals("")) name2 = scanner.nextLine();
        System.out.print("code : ");
        String code2 = scanner.nextLine();
        if (code2.equals("")) code2 = scanner.nextLine();
        System.out.print("price : ");
        int price2 = scanner.nextInt();

        System.out.println("Enter details of product 3");
        System.out.print("name : ");
        String name3 = scanner.nextLine();
        if (name3.equals("")) name3 = scanner.nextLine();
        System.out.print("code : ");
        String code3 = scanner.nextLine();
        if (code3.equals("")) code3 = scanner.nextLine();
        System.out.print("price : ");
        int price3 = scanner.nextInt();

        Product item1 = new Product(name1, code1, price1);
        Product item2 = new Product(name2, code2, price2);
        Product item3 = new Product(name3, code3, price3);

        Product smallest = (item1.price < item2.price) ? item1 : item2;
        smallest = (smallest.price < item3.price) ? smallest : item3;

        System.out.println(smallest.name + " have a smallest price of " + smallest.price);

        scanner.close();
    }
}