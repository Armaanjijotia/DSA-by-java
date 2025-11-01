import java.util.Scanner;

public class function {

    // 1. Print user's name
    public static void printMyName(String name) {
        System.out.println("Your name is: " + name);
    }

    // 2. Sum of two numbers
    public static int sumOfTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);
        return sum;
    }

    // 3. Multiplication of two numbers
    public static int multiplyTwo(int a, int b) {
        int mult = a * b;
        System.out.println("Multiplication of a and b is: " + mult);
        return mult;
    }

    // 4. Factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Name printing
        System.out.print("Enter your name: ");
        String name = sc.next();
        printMyName(name);

        // Sum and multiplication
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        sumOfTwo(a, b);
        multiplyTwo(a, b);

        // Factorial
        System.out.print("Enter number n to find factorial: ");
        int n = sc.nextInt();
        factorial(n);

        sc.close(); // Always good practice to close Scanner
    }
}
