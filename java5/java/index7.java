package java5.java;

import java.util.Random;
import java.util.Scanner;

public class index7 {
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

        System.out.println("\n=== 7. Search for a value in the array ===");

        System.out.print("Enter the number you want to find: ");
        int searchValue = input.nextInt();

        System.out.print("Positions where " + searchValue + " appears: ");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("Not found");
        }

        System.out.println();  
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("→ Found " + count + " time(s)");
        }

        input.close();
    }
}