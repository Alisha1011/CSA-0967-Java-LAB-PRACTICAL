import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal;

        System.out.print("Enter decimal number: ");
        decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Binary Number: " + binary);
        System.out.println("Octal Number: " + octal);
    }
}
