package java5.java;
import java.util.Scanner;
import java.util.Random;
public class index2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("array (size): ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("\n array random(1-100)");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        System.out.println("the result of array random:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        System.out.print("\n array : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        input.close();
    }
}
