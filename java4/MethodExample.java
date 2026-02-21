package java4;

public class MethodExample {

    // User-defined recursive method
    static int factorial(int n) {
        if (n == 1) {              // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result); // Output: 120
    }
}
