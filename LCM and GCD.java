import java.util.Scanner;

public class LcmGcdCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int lcm = findLcm(numbers);
        int gcd = findGcd(numbers);

        
        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }

    
    public static int findLcm(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / findGcd(lcm, numbers[i]);
        }
        return lcm;
    }
    public static int findGcd(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = findGcd(gcd, numbers[i]);
        }
        return gcd;
    }

    
    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
