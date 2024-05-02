import java.util.Scanner;

class LinkedList { 
	Node head; 

	static class Node { 
		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	public static LinkedList insert(LinkedList list, int data) 
	{ 
		Node new_node = new Node(data); 
		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			last.next = new_node; 
		} 

		return list; 
	} 

	public static void removeElements(LinkedList list){
		list.head = null;
	}

	public static void printList(LinkedList list) 
	{ 
		Node currentNode = list.head; 
	
		System.out.print("LinkedList: "); 

		if(currentNode == null) System.out.print("[]");
		while (currentNode != null) { 
			System.out.print(currentNode.data + " "); 
			currentNode = currentNode.next; 
		} 
		System.out.println("");
	} 
	
	public static void main(String[] args) 
	{ 
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Remove all elements from a linked list.\nDate : 15/04/2024\n");
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList(); 

		System.out.print("Enter the no.of elements : ");
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++){
			System.out.print("Enter the number : ");
			list = insert(list, scanner.nextInt());
		}
		printList(list); 

		while(true){
			System.out.print("Do you want to remove all elements (yes/no) : ");
			String choice = scanner.nextLine();
			if(choice.isEmpty()) choice = scanner.nextLine(); // Solved the auto read issue on console.
			if(choice.equals("yes")){
				System.out.println("Elements removed.");
				removeElements(list);
				printList(list);
				break;
			} else if(choice.equals("no")) {
				System.out.println("Elements not removed.");
				printList(list);
				break;
			} else {
				System.out.println("Invalid choice.");
			}
		}
		scanner.close();
	} 
}

