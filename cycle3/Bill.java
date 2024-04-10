import java.util.Scanner;

interface Calculate {
    void calculate();
}
class Product {
    int id, quantity, unitPrice, total;
    String name;

    Product(int id, String name, int quantity, int unitPrice){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = quantity * unitPrice;
    }
}
class Order implements Calculate {
    int orderNo;
    String orderDate;
    int netAmt;
    int i = 0;
    Product [] list = new Product[20]; 

    Order(int orderNo, String orderDate){
        this.orderNo = orderNo;
        this.orderDate = orderDate;
    }
    void add(int id, String name, int quantity, int unitPrice){
        list[i++] = new Product(id, name, quantity, unitPrice);
    }
    public void calculate(){
        netAmt = 0;
        for(int k=0; k<i; k++){
            netAmt += list[k].total;    
        }
        this.display();
    }
    void display(){
        System.out.println("\nOrder no. : " + orderNo + "\nDate : " + orderDate);
        System.out.println("Product id    Name    Quantity    Unit price    Total\n-------------------------------------------------------");
        for(int k=0; k<i; k++){
            System.out.println(list[k].id + "           " + list[k].name + "   " + list[k].quantity + "           " + list[k].unitPrice + "            " + list[k].total);
        }
        if(i==0) System.out.println("No product added.");
        System.out.println("-------------------------------------------------------\n                                  Net.Amount    " + netAmt);
    }
}
public class Bill {
    public static void main(String [] arg){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Calculate bill.\nDate : 08/04/2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the order no : ");
        int orderNo = scanner.nextInt();
        System.out.print("Enter the order date : ");
        scanner.nextLine();
        String orderDate = scanner.nextLine();
        Order order = new Order(orderNo, orderDate);
        boolean status = true;
        while(status){
            System.out.print("\nOPERATIONS\n-------------------\n1) Add product\n2) Calculate total\n3) Exit\n-------------------\nChoose one : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter the product id : ");
                    int id = scanner.nextInt();
                    System.out.print("Enter the product name : ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter the product quantity : ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter the product unit price : ");
                    int unitPrice = scanner.nextInt();
                    order.add(id, name, quantity, unitPrice);
                    break;
                case 2:
                    order.calculate();
                    break;
                case 3: 
                    status = false;
                    break;
                default: 
                    System.out.println("\nInvalid choice.\n");
            }
        }

        scanner.close();
    }   
}
