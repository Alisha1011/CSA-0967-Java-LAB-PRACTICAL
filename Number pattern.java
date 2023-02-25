import java.util.Scanner;

public class Pattern {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter the number of rows: ");
      int rows = input.nextInt();

      
      for (int i = 0; i < rows; i++) {
         int num = 1;
         for (int j = 0; j <= i; j++) {
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
         }
         System.out.println();
      }
   }
}
