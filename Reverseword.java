import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object to read input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine(); // read a word from the user
        
        String reversedWord = ""; // initialize an empty string to hold the reversed word
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i); // add each character in reverse order to the reversedWord string
        }
        
        System.out.println("Reversed word: " + reversedWord); // print the reversed word
    }
}
