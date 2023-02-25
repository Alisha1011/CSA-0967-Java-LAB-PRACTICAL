import java.util.*;

public class ArrayStatistics {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter the size of the array: ");
      int size = input.nextInt();

      
      int[] arr = new int[size];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < size; i++) {
         arr[i] = input.nextInt();
      }

      
      double sum = 0;
      for (int i = 0; i < size; i++) {
         sum += arr[i];
      }
      double mean = sum / size;
      System.out.println("Mean: " + mean);

      
      Arrays.sort(arr);
      double median;
      if (size % 2 == 0) {
         median = (arr[size/2] + arr[size/2 - 1]) / 2.0;
      } else {
         median = arr[size/2];
      }
      System.out.println("Median: " + median);

      
      int mode = 0;
      int maxCount = 0;
      for (int i = 0; i < size; i++) {
         int count = 0;
         for (int j = 0; j < size; j++) {
            if (arr[j] == arr[i]) {
               count++;
            }
         }
         if (count > maxCount) {
            maxCount = count;
            mode = arr[i];
         }
      }
      System.out.println("Mode: " + mode);
   }
}
