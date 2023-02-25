import java.util.Scanner;

public class MatrixAddition {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of rows and columns of the matrices: ");
      int numRows = input.nextInt();
      int numCols = input.nextInt();

      int[][] matrix1 = new int[numRows][numCols];
      int[][] matrix2 = new int[numRows][numCols];
      int[][] sumMatrix = new int[numRows][numCols];

      System.out.println("Enter the elements of the first matrix: ");
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j < numCols; j++) {
            matrix1[i][j] = input.nextInt();
         }
      }

      System.out.println("Enter the elements of the second matrix: ");
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j < numCols; j++) {
            matrix2[i][j] = input.nextInt();
         }
      }

      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j < numCols; j++) {
            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      System.out.println("The sum of the matrices is: ");
      for (int i = 0; i < numRows; i++) {
         for (int j = 0; j < numCols; j++) {
            System.out.print(sumMatrix[i][j] + " ");
         }
         System.out.println();
      }
   }
}
