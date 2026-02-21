package java5.java;
import java.util.Scanner;
public class index1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(". input array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("-> result of array: "+ size + "elements");
        System.out.println(". array: arr");
        System.out.println(". type of int[]");
        System.out.println(". size of array: " + arr.length);

        input.close();
    }
}