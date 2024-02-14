import java.util.Scanner;

class Manipulation{
    public static void main(String arg[]){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : String manipulation\nDate : 13/02/2024\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scanner.nextLine();

        System.out.println("\nString is : " + str);
        System.out.println("Length of the string is : " + str.length());
        System.out.println("Character at the position is : " + str.charAt(0));

        System.out.print("Enter a substring to check : ");
        String subStr = scanner.nextLine();
        if(str.contains(subStr)) System.out.println("String '" + str + "' contains the substring '" + subStr + "'");
        else System.out.println("String '" + str + "' not contains the substring '" + subStr + "'");
    }
}