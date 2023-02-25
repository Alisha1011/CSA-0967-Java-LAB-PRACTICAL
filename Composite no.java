import java.util.Scanner;

public class CompositeNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter the size of the array: ");
      int size = input.nextInt();

     
      int[] arr = new int[size];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < size; i++) {
         arr[i] = input.nextInt();
      }

      
      int compositeCount = 0;
      for (int i = 0; i < size; i++) {
         if (isComposite(arr[i])) {
            compositeCount++;
         }
      }

     
      System.out.println("Number of composite numbers in the array: " + compositeCount);
   }

   
   public static boolean isComposite(int n) {
      if (n <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) {
            return true;
         }
      }
      return false;
   }
}
