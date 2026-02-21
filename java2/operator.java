package java2;
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Operator (+ - * /): ");
        char op = input.next().charAt(0);

        System.out.print("a = ");
        double a = input.nextDouble();

        System.out.print("b = ");
        double b = input.nextDouble();

        System.out.println("=============================");

        double result =
            (a + b) * (op == '+' ? 1.0 : 0.0) +
            (a - b) * (op == '-' ? 1.0 : 0.0) +
            (a * b) * (op == '*' ? 1.0 : 0.0) +
            (a / b) * (op == '/' ? 1.0 : 0.0) * (b != 0 ? 1.0 : 0.0);

        System.out.printf("%.2f %c %.2f = %.2f\n", a, op, b, result);

        System.out.println("\n============================");

        input.close();
    }
}                                                                                                                