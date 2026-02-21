package java5.java;
import java.util.Random;
import java.util.Scanner;

public class index4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("\nFilling array with random values (1 to 100)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.print("\nArray: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
     
        System.out.println("\n=== 4. Find Minimum and Maximum + their indices ===");

       
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // Output results
        System.out.println("Minimum value    : " + min);
        System.out.println("   at index     : " + minIndex);
        
        System.out.println("Maximum value    : " + max);
        System.out.println("   at index     : " + maxIndex);

        System.out.println("\n(0-based index: " + minIndex + " / 1-based position: " + (minIndex + 1) + ")");
        System.out.println("(0-based index: " + maxIndex + " / 1-based position: " + (maxIndex + 1) + ")");

        input.close();
    }
}