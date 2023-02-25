import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        
        int vowelCount = 0; 
        
        for (int i = 0; i < statement.length(); i++) {
            char c = statement.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount); 
    }
    
    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU"; 
        return vowels.indexOf(c) != -1; 
    }
}
