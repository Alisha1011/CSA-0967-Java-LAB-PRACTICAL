import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        int i = 1;

        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        
        if(n<=0) {
            System.out.println("Invalid input. n should be a positive number.");
            return;
        }
        System.out.print("First " + n + " perfect numbers are: ");
        while (count < n) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
