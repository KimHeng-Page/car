package java2;
import java.util.Scanner;
public class relational {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input a: ");
        double a = input.nextDouble();
        System.out.print(". please input b: ");
        double b = input.nextDouble();

        System.out.println("\n Relational Opetation");
        System.out.println("->"  + a + "==" + b +":"  + (a == b));
        System.out.println("->"  + a + "==" + b +":"  + (a != b));
        System.out.println("->"  + a + "==" + b +":"  + (a > b));
        System.out.println("->"  + a + "==" + b +":"  + (a < b));
        System.out.println("->"  + a + "==" + b +":"  + (a >= b));
        System.out.println("->"  + a + "==" + b +":"  + (a <= b));
        input.close();
    }
}
