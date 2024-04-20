import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// import auth.util.AuthChecker;
class UserDefinedException extends Exception {
    public UserDefinedException(String message){
        super(message);
    }
}

class AuthChecker extends Exception{
    String username, password;
    Pattern usernamePattern = Pattern.compile("^[a-z]{6,}");
    Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}$");
    
    public AuthChecker(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean usernameChecker(){
        Matcher matcher = usernamePattern.matcher(this.username);
        try {
            if(matcher.find()){
                System.out.println("Username passed...");
                return true;
            } else {
                throw new UserDefinedException("Invalid username (need 6 lowercase letters)");
            }
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean passwordChecker(){
        Matcher mat = passwordPattern.matcher(this.password);
        try {
            if(mat.find()){
                System.out.println("Password passed...");
                return true;
            } else {
                throw new UserDefinedException("Password failed (Should contain atleast 1 lowercase, 1 uppercase and 1 digit and minimum 6 characters)");
            }
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
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
