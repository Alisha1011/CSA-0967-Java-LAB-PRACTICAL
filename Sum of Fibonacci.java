import java.util.Scanner;

public class FibonacciEvenSum {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

       
        int num1 = 0, num2 = 1;
        int evenSum = 0;

        
        while (num2 <= n) {
            if (num2 % 2 == 0) {
                evenSum += num2;
            }
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

        
        System.out.println("Sum of even numbers in the Fibonacci sequence up to " + n + " is " + evenSum);

    }

}
