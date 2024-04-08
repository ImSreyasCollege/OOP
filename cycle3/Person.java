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
        System.out.println("Name: " + name + " gender: " + gender + " address: " + address + " age: " + age);
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
       System.out.println("Employee Id : " + empId + " Company name : " + companyName + " Qualification : " + qualification + " Salary : " + salary); 
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
       System.out.println("Teacher Id : " + teacherId + " Department : " + department + " Subject : " + subject); 
       super.display();
    }
}

class PersonMain {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of Teachers : ");
        int TeacherCount = scanner.nextInt();

        Teacher [] Teachers = new Teacher[TeacherCount];
        for (int i=0; i<TeacherCount; i++) {
            // Teachers[i] = new Teacher();
        }

        scanner.close();
    }
}