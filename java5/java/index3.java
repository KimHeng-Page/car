package java5.java;

import java.util.Random;
import java.util.Scanner;

public class index3 {
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

        System.out.println("\n=== 3. Calculate Sum and Average ===");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        double average = (double) sum / arr.length;

        System.out.println("Number of elements      : " + arr.length);
        System.out.println("Sum                     : " + sum);
        System.out.printf("Average                 : %.2f\n", average);

        System.out.print("\nArray values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }
}