package auth.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthChecker {
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
                throw new Exception("Invalid username (need 6 lowercase letters)");
            }
        } catch (Exception e) {
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
                throw new Exception("Password failed (Should contain atleast 1 lowercase, 1 uppercase and 1 digit and minimum 6 characters)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}