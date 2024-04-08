import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    public Person(String name, String gender, String address, int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name + "\nGender: " + gender + "\nAddress: " + address + "\nAge: " + age);
    }
}

class Employee extends Person {
    int empId, salary;
    String companyName, qualification;

    public Employee(int empId, String companyName, String qualification, int salary, String name, String gender, String address, int age){
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
    void display(){
       System.out.println("Employee Id : " + empId + "\nCompany name : " + companyName + "\nQualification : " + qualification + "\nSalary : " + salary); 
       super.display();
    }
}

class Teacher extends Employee {
    int teacherId;
    String subject, department;

    public Teacher (int teacherId, String subject, String department, int empId, String companyName, String qualification, int salary, String name, String gender, String address, int age){
        super(empId, companyName, qualification, salary, name, gender, address, age);
        this.teacherId = teacherId;
        this. subject = subject;
        this.department = department;
    }
    void display(){
       System.out.println("Teacher Id : " + teacherId + "\nDepartment : " + department + "\nSubject : " + subject); 
       super.display();
    }
}

class PersonMain {
    public static void main(String[] arg){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Details of Teachers.\nDate : 06/04/2024\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of Teachers : ");
        int TeacherCount = scanner.nextInt();

        Teacher [] Teachers = new Teacher[TeacherCount];
        for (int i=0; i<TeacherCount; i++) {
            System.out.println("\nEnter the Teacher details");
            System.out.print("Enter the Teacher id : ");
            int id = scanner.nextInt();
            System.out.print("Enter the Subject : ");
            scanner.nextLine();
            String subject = scanner.nextLine();
            System.out.print("Enter the Department : ");
            String department = scanner.nextLine();
            System.out.print("Enter the Employee id : ");
            int empId = scanner.nextInt();
            System.out.print("Enter the Company name : ");
            scanner.nextLine();
            String companyName = scanner.nextLine();
            System.out.print("Enter the Qualification : ");
            String qualification = scanner.nextLine();
            System.out.print("Enter the Salary : ");
            int salary = scanner.nextInt();
            System.out.print("Enter the Name : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter the Gender : ");
            String gender = scanner.nextLine();
            System.out.print("Enter the Address : ");
            String address = scanner.nextLine();
            System.out.print("Enter the Age : ");
            int age = scanner.nextInt();

            Teachers[i] = new Teacher(id, subject, department, empId, companyName, qualification, salary, name, gender, address, age);
        }
        for (int i=0; i<TeacherCount; i++){
            System.out.println("\nDetails of Teacher " + (i+1));
            Teachers[i].display();
        }

        scanner.close();
    }
}