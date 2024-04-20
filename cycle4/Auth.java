import java.util.Scanner;
// import auth.util.AuthChecker;
class UserDefinedException extends Exception {
    public UserDefinedException(String message){
        super(message);
    }
}

class AuthChecker {
    String username, password;
    String USERNAME = "admin";
    String PASSWORD =  "admin@123";
    
    public AuthChecker(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean usernameChecker(){
        try {
            if(USERNAME.equals(this.username)){
                System.out.println("Username passed...");
                return true;
            } else {
                throw new UserDefinedException("Invalid username");
            }
        } catch (UserDefinedException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean passwordChecker(){
        try {
            if(PASSWORD.equals(this.password)){
                System.out.println("Password passed...");
                return true;
            } else {
                throw new UserDefinedException("Invalid password");
            }
        } catch (UserDefinedException e) {
            System.out.println(e);
            return false;
        }
    }
}
public class Auth {
    public static void main(String [] arg) {
		System.out.println("Name : Sreyas Satheesh\nRoll.no : 53\nTitle : Username & Password checker.\nDate : 15/04/2024\n");
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
            if(flag == 2) {
                System.out.println("User authenticated successfully");
                break;
            }
        }
        scanner.close();
    }   
}
