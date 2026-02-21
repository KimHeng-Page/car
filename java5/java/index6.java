package java5.java;

import java.util.Random;
import java.util.Scanner;

public class index6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("\nFilling array with random values (1–100)...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("\nArray contents:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d%n", i, arr[i]);
        }

        System.out.println("\n=== 6. Get value by index ===");

        System.out.printf("Enter index (0 to %d): ", arr.length - 1);
        int index = input.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Value at index " + index + " = " + arr[index]);
        } else {
            System.out.println("Error: Index out of bounds!");
            System.out.printf("Valid range is 0 to %d only.%n", arr.length - 1);
        }

        System.out.println("\nReminder:");
        System.out.println("• Java arrays use 0-based indexing");
        System.out.println("• First element  → index 0");
        System.out.println("• Last element   → index " + (arr.length - 1));

        input.close();
    }
}