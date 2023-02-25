import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine(); 
        
        boolean isValid = true; 
        
        if (username.length() < 4 || username.length() > 16) {
            
            isValid = false;
        } else {
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (!Character.isLetterOrDigit(c) && c != '_' && c != '-') {
                    isValid = false;
                    break;
                }
            }
        }
        
        if (isValid) {
            System.out.println("The username " + username + " is valid.");
        } else {
            System.out.println("The username " + username + " is not valid.");
        }
    }
}
