import java.util.Scanner;

public class FindCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String string = scanner.nextLine(); 
        System.out.print("Enter a character to find: ");
        char c = scanner.next().charAt(0); 
        
        int index = -1; 
        
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                index = i; 
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("The character '" + c + "' is not present in the string."); 
        } else {
            System.out.println("The character '" + c + "' is present at index " + index + " in the string.");
        }
    }
}
