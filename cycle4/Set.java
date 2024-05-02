import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Compare two hash sets.\nDate : 15/04/2024\n");
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        System.out.print("Enter the no.of elements in set 1 : ");
        int n1 = scanner.nextInt();
        for(int i = 0; i < n1; i++) {
            System.out.print("Enter the element : ");
            set1.add(scanner.nextInt());
        }

        System.out.print("Enter the no.of elements in set 2 : ");
        int n2 = scanner.nextInt();
        for(int i = 0; i < n2; i++) {
            System.out.print("Enter the element : ");
            set2.add(scanner.nextInt());
        }

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        if (set1.equals(set2)) {
            System.out.println("The two hash sets are equal.");
        } else {
            System.out.println("The two hash sets are not equal.");
        }
        scanner.close();
    }
}

