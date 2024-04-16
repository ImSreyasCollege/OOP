import java.util.Scanner;
import auth.util.AuthChecker;

public class Auth {
    public static void main(String [] arg) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("username : ");
            String username = scanner.nextLine();
            System.out.println("password : ");
            String password = scanner.nextLine();
            AuthChecker auth = new AuthChecker(username, password);
            if(auth.usernameChecker()){
                flag++;
            }  
            if(auth.passwordChecker()){
                flag++;
            }
            if(flag == 2) break;
        }
    }   
}
