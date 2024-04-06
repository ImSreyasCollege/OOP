class Person {
    String name, gender, address;
    int age;

    public Person(String name, String gender, String address, int age){
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
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
        System.out.println("\nTest");
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
        System.out.println("\nTeacher id : " + this.teacherId + "\nSubject : " + this.subject + "\nDepartment : " + this.department);
        super().display();
    }
}

class TeacherDetails {
    public static void main(String []arg) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Details of Teachers.\nDate : 06/04/2024\n");

    }
}