import java.util.Scanner;

class Employee {
    public int Empid, Salary;
    public String Name, Address;

    public Employee(int Empid, String Name, int Salary, String Address) {
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}
class Teacher extends Employee {
    String Department, Subject;

    public Teacher(int Empid, String Name, int Salary, String Address, String Department, String Subject) {
        super(Empid, Name, Salary, Address);
        this.Department = Department;
        this.Subject = Subject;
    }
    void Display(){
        System.out.println("\nEmpolyee id : " + super.Empid);
        System.out.println("Empolyee name : " + super.Name);
        System.out.println("Empolyee salary : " + super.Salary);
        System.out.println("Empolyee address : " + super.Address);
        System.out.println("Department : " + this.Department);
        System.out.println("Subject taught : " + this.Subject);
    }
}
class Main {
    public static void main(String args[]){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Details of Employee.\nDate : 06/04/2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no.of Teachers : ");
        int n = scanner.nextInt();
        Teacher []arr = new Teacher[n];
        System.out.println("Enter the details ");
        for(int i=0; i< n; i++){
            System.out.println("Enter the details of Teacher " + (i+1) + " : ");
            System.out.print("id : ");
            int id = scanner.nextInt();
            System.out.print("name : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("salary : ");
            int salary = scanner.nextInt();
            System.out.print("Address : ");
            scanner.nextLine();
            String address = scanner.nextLine();
            System.out.print("Department : ");
            String department = scanner.nextLine();
            System.out.print("Subject : ");
            String subject = scanner.nextLine();
            arr[i] = new Teacher(id, name, salary, address, department, subject);   
        }
        System.out.println("\nDetials\n");
        for(int i =0; i< n; i++){
            arr[i].Display();
        }
        scanner.close();
    }
}
