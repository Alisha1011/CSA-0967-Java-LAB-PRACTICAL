import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String input;

        System.out.print("Enter choice (1 for string, 2 for number): ");
        choice = scanner.nextInt();
        scanner.nextLine(); // to consume the newline character after the number input

        if (choice == 1) {
            System.out.print("Enter string: ");
            input = scanner.nextLine();
            if (isPalindrome(input)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        } else if (choice == 2) {
            System.out.print("Enter number: ");
            input = scanner.nextLine();
            if (isPalindrome(input)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
