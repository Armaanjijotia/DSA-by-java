import java.util.Scanner;

/**
 * Demonstrates basic Java functions: printing a name, arithmetic operations, and factorial.
 */
public class FunctionExamples {

    /**
     * Prints the user's name.
     * @param name The name to print.
     */
    public static void printMyName(String name) {
        System.out.println("Your name is: " + name);
    }

    /**
     * Returns the sum of two integers.
     * @param a First number.
     * @param b Second number.
     * @return The sum of a and b.
     */
    public static int sumOfTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);
        return sum;
    }

    /**
     * Returns the product of two integers.
     * @param a First number.
     * @param b Second number.
     * @return The product of a and b.
     */
    public static int multiplyTwo(int a, int b) {
        int product = a * b;
        System.out.println("Multiplication of a and b is: " + product);
        return product;
    }

    /**
     * Calculates the factorial of a number.
     * @param n The number.
     * @return The factorial of n.
     */
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 1. Print user's name ---
        System.out.print("Enter your name: ");
        String name = sc.next();
        printMyName(name);

        // --- 2. Sum and multiplication ---
        System.out.print("Enter number a: ");
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        sumOfTwo(a, b);
        multiplyTwo(a, b);

        // --- 3. Factorial ---
        System.out.print("Enter number n to find factorial: ");
        int n = sc.nextInt();
        factorial(n);

        sc.close(); // Always good practice to close Scanner
    }
}

