package java2;
import java.util.Scanner;
public class precedence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input a: ");
        int a = input.nextInt();

        System.out.print(". please input b: ");
        int b = input.nextInt();

        int res = (a + b) * (a - b);

        System.out.println("\n Operator Precedence");
        System.out.print("Operator Precedence : " + res);
        input.close();
    }
}
