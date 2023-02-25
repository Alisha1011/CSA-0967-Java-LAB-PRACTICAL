import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        
        String stringWithoutVowels = removeVowels(string); 
        
        System.out.println("String without vowels: " + stringWithoutVowels); 
    }
    
    public static String removeVowels(String string) {
        String vowels = "aeiouAEIOU"; 
        StringBuilder result = new StringBuilder(); 
        
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (vowels.indexOf(c) == -1) {
                result.append(c); 
            }
        }
        
        return result.toString();
    }
}
