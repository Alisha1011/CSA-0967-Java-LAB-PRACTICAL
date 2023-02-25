import java.util.Scanner;

public class CountSpecialChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine(); 
        
        int specialCharCount = 0; 
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                System.out.println(c); 
                specialCharCount++; 
            }
        }
        
        System.out.println("Number of special characters: " + specialCharCount); // print the count of special characters
    }
}
