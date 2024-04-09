import java.util.Scanner;

class Student {
    String name, academicScore;
    public Student(String name, String academicScore){
        this.name = name;
        this.academicScore = academicScore;
    }
    void display(){
        System.out.println("Student name : " + name + "\nAcademic Score : " + academicScore);
    }
}
interface Sports  {
    void displaySportsScore();
}
class Result extends Student implements Sports {
    String sportsName, sportsScore;

    public Result(String name, String academicScore, String sportsName, String sportsScore){
        super(name, academicScore);
        this.sportsName = sportsName;
        this.sportsScore = sportsScore;
    }
    public void displaySportsScore(){
        System.out.println("Sports name : " + sportsName + "\nSports Score : " + sportsScore);
    }
    void display(){
        System.out.println("\nStudent Details");
        super.display();
        displaySportsScore();
    }
}
class ResultDetails {
    public static void main(String [] args){
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Student academic & sports details.\nDate : 08/04/2024\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Details of the student");
        System.out.print("name : ");
        String name = scanner.nextLine();
        System.out.print("academic score : ");
        String academicScore = scanner.nextLine();
        System.out.print("sports name : ");
        String sportsName = scanner.nextLine();
        System.out.print("sports score : ");
        String sportsScore = scanner.nextLine();
        Result object = new Result(name, academicScore, sportsName, sportsScore);
        object.display();

        scanner.close();
    } 
}