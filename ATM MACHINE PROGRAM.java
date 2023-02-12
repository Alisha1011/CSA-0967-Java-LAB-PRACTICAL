import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int[] denominations = new int[4];
        int[] notes = new int[denominations.length];
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i+1) + "th Denomination: ");
            denominations[i] = scanner.nextInt();
            System.out.print("Enter the " + (i+1) + "th Denomination number of notes: ");
            notes[i] = scanner.nextInt();
            total += notes[i] * denominations[i];
        }

        System.out.println("Total Available Balance in ATM: " + total);
    }
}
