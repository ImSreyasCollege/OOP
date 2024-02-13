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
public class Product {

	public static void main(String[] arguments){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Product Class\nDate : 13/02/2024\n");

		ProductClass obj1 = new ProductClass("watch", 101, 5000);
		ProductClass obj2 = new ProductClass("phone", 102, 15000);
		ProductClass obj3 = new ProductClass("tv", 103, 25000);

		int minimum = obj1.price < obj2.price ? obj1.price : obj2.price;
		minimum = minimum < obj3.price ? minimum : obj3.price;
		System.out.println("Smallest value is : " + minimum);
	}
}

