import java.util.Scanner;
import auth.util.AuthChecker;

public class Auth {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int flag = 0;
            System.out.print("\nusername : ");
            String username = scanner.nextLine();
            System.out.print("password : ");
            String password = scanner.nextLine();
            AuthChecker auth = new AuthChecker(username, password);
            if(auth.usernameChecker()) flag++;
            if(auth.passwordChecker()) flag++;
            if(flag == 2) break;
        }
    }   
}
