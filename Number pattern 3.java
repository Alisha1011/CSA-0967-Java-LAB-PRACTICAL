import java.util.Scanner;

public class Pattern {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter the number of rows: ");
      int rows = input.nextInt();

      
      for (int i = 1; i <= rows; i++) {
         int num = i * i;
         for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num += 2 * (rows - j);
         }
         System.out.println();
      }
   }
}
