import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is eligible to vote or not
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            // Calculate the number of years left until the person is eligible to vote
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote.");
            System.out.println("You will be eligible to vote in " + yearsLeft + " year(s).");
        }
    }
}
