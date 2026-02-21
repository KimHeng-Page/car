//just selection on one library import from util Scanner
import java.util.Scanner;
//This code use to get familiar with constants and data types in Java
import java.util.*;
public class gonst {
    public static void main(String[] args){

        final String COMPANY_NAME =  "Java Academy";
        System.out.println(COMPANY_NAME);

        boolean result = true;
        System.out.println("Result: " + result);

        char grade = 'A';
        System.out.println("Grade: " + grade);

        char grade2 = 65;
        System.out.println("Grade2: " + grade2);

        int score = 100;    
        System.out.println("Score: " + score);

        short s = 30000;
        System.out.println("Short: " + s);

        byte b = 100;
        System.out.println("Byte: " + b);

        long l = 100000L;
        System.out.println("Long: " + l);

        float f = 10.5f;
        System.out.println("Float: " + f);

        double d = 20.5;
        System.out.println("Double: " + d);

        int[] array = {1, 2, 3, 4, 5};
       System.out.println("Array: " 
                + array[0] + ", " 
                + array[1] + ", " 
                + array[2] + ", " 
                + array[3] + ", " 
                + array[4]);
        String message = "Welcome to " + COMPANY_NAME;
        System.out.println(message);

    }
}
