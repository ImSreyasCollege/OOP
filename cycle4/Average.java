import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}
public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the no.of elements : ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            System.out.print("Enter the element : ");
            int num = scanner.nextInt();
            try {
                if(num < 0) {
                    i--;
                    throw new NegativeException(num + " is a negative number.");
                } else {
                    sum+=num;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Average is : " + (float)sum/n);
        scanner.close();
    }
}
