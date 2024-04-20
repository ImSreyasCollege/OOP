
import java.util.LinkedList;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Remove an object from the Stack when the position is passed.\nDate : 15/04/2024\n");
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            boolean exit = false;
            System.out.print("\nSTACK OPERATIONS\n========================\n1. Push\n2. Pop\n3. Remove at a position\n4. Exit\nEnter your choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: 
                    System.out.print("Enter the element : ");
                    stack.push(scanner.nextInt());
                    System.out.println("Stack : " + stack);
                    break;
                case 2:
                    removeElementAtPosition(stack);
                    System.out.println("Stack : " + stack);
                    break;
                case 3:
                    System.out.print("Enter the position : ");
                    removeElementAtPosition(stack, scanner.nextInt());
                    System.out.println("Stack : " + stack);
                    break;
                case 4:
                    exit = true;
                    break;
                default: 
                    System.out.println("Invalid choice.");
            }
            if(exit) break;
        }
        scanner.close();
    }

    public static void removeElementAtPosition(LinkedList<Integer> stack, int position) {
        if (position < 0 || position >= stack.size()) {
            System.out.println("Invalid position.");
        } else {
            stack.remove(position);
        }
    }
    public static void removeElementAtPosition(LinkedList<Integer> stack) {
        stack.pop();
    }
}
