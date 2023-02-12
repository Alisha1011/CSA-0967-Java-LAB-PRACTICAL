import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] elements = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;

        Arrays.sort(elements);
        int[] sortedElements = new int[elements.length];
        int j = 0;
        for(int i = elements.length - 1; i >= 0; i--) {
            sortedElements[j] = elements[i];
            j++;
        }

        int MthMax = sortedElements[M-1];
  
        Arrays.sort(elements);
 
        int NthMin = elements[N-1];
     
        int sum = MthMax + NthMin;
       
        int difference = MthMax - NthMin;

        System.out.println("Mth maximum number: " + MthMax);
        System.out.println("Nth minimum number: " + NthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
