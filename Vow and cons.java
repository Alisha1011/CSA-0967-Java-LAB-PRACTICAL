import java.util.Scanner;

public class SeparateConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a word: ");
        String word = scanner.nextLine(); 
        
        String consonants = ""; 
        String vowels = ""; 
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                vowels += c; 
            } else {
                consonants += c; 
            }
        }
        
        System.out.println("Consonants: " + consonants); 
        System.out.println("Vowels: " + vowels); 
    }
    
    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU"; 
        return vowels.indexOf(c) != -1; 
    }
}
