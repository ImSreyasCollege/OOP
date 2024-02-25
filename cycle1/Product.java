import java.util.Scanner;

class ProductClass{
	String pname;
	int pcode;
	int price;
	public ProductClass(String name,int code,int price){
		this.pname = name;
		this.pcode = code;
		this.price = price;
	}
}
class Product {

	public static void main(String[] arguments){
		System.out.println("\nName : Sreyas Satheesh\nRoll.no : 53\nTitle : Product Class\nDate : 13/02/2024\n");

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the code of the first product : ");
		int code1 = scan.nextInt();
		System.out.print("Enter the name of the first product : ");
		scan.nextLine();
		String name1 = scan.nextLine();
		System.out.print("Enter the price of the first product : ");
		int price1 = scan.nextInt();

		System.out.print("\nEnter the code of the second product : ");
		int code2 = scan.nextInt();
		System.out.print("Enter the name of the second product : ");
		scan.nextLine();
		String name2 = scan.nextLine();
		System.out.print("Enter the price of the second product : ");
		int price2 = scan.nextInt();

		System.out.print("\nEnter the code of the third product : ");
		int code3 = scan.nextInt();
		System.out.print("Enter the name of the third product : ");
		scan.nextLine();
		String name3 = scan.nextLine();
		System.out.print("Enter the price of the third product : ");
		int price3 = scan.nextInt();

		ProductClass obj1 = new ProductClass(name1, code1, price1);
		ProductClass obj2 = new ProductClass(name2, code2, price2);
		ProductClass obj3 = new ProductClass(name3, code3, price3);

		ProductClass minimum = obj1.price < obj2.price ? obj1 : obj2;
		minimum = minimum.price < obj3.price ? minimum : obj3;
		System.out.println("\nThe product with the smallest price is " + minimum.pname + " with a price of " + minimum.price + "\n");
	}
}

