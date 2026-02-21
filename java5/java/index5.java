package java5.java;
import java.util.Random;
import java.util.Scanner;
public class index5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=== 5. Create a new array and fill with random values ===");

        System.out.print("Enter size for the NEW array: ");
        int newSize = input.nextInt();

        int[] newArr = new int[newSize];

        System.out.println("Filling new array with random values (1 to 50)...");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rand.nextInt(50) + 1;
        }

        System.out.println("\nNew array created (size = " + newSize + "):");
        System.out.print("Values: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

        System.out.println("Short format: " + java.util.Arrays.toString(newArr));

        System.out.println("\nNote: This is a completely new array (different from previous ones)");

        input.close();
    }
}