package java2;
import  java.util.Scanner;
public class integer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input a: ");
        double a = input.nextDouble();
        System.out.print(". please input b: ");
        double b = input.nextDouble();

        double sum = (a + b),
                dif = (a - b),
                prd = (a * b),
                quo = ( a / b),
                rem = ( a % b);

        System.out.println("\n Calculator ");
        System.out.print( ". sum : " + sum + "\n" +
                         " . different : " + dif + "\n" +
                         " . product : " + prd + "\n" +
                         " . quotient : " + quo + "\n" +
                         " . remainder : " + rem + "\n"
        );  
        input.close();
    }
}
