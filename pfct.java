import java.util.Scanner;

public class PracticeFunctions {

    // 1. Enter 3 numbers from the user & print their average.
    public static float averageOfThree(int a, int b, int c) {
        float avg = (a + b + c) / 3.0f;
        System.out.println("Average is: " + avg);
        return avg;
    }

    // 2. Print the sum of all odd numbers from 1 to n.
    public static int sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // 3. Return the greater of two numbers.
    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            System.out.println("a is greater.");
            return a;
        } else {
            System.out.println("b is greater.");
            return b;
        }
    }

    // 4. Calculate the circumference of a circle.
    public static float circumference(float radius) {
        float pi = 3.14f;
        float circumference = 2 * pi * radius;
        System.out.println("Circumference of the circle: " + circumference);
        return circumference;
    }

    // 5. Check if a person is eligible to vote.
    public static boolean isEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote.");
            return true;
        } else {
            System.out.println("Not eligible to vote.");
            return false;
        }
    }

    // 6. Infinite loop using do-while.
    public static void infiniteLoop() {
        do {
            System.out.println("This is an infinite loop.");
        } while (true);
    }

    // 7. x raised to the power of n.
    public static double calculatePower(int x, int n) {
        return Math.pow(x, n);
    }

    // 8. Calculate the Greatest Common Divisor (GCD) of two numbers.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment to test each function individually:

        // 1. Average of three numbers
        // System.out.print("Enter three numbers: ");
        // averageOfThree(sc.nextInt(), sc.nextInt(), sc.nextInt());

        // 2. Sum of odd numbers
        // System.out.print("Enter a number: ");
        // int sum = sumOfOdds(sc.nextInt());
        // System.out.println("Sum of odd numbers: " + sum);

        // 3. Greater of two numbers
        // System.out.print("Enter two numbers: ");
        // maxOfTwo(sc.nextInt(), sc.nextInt());

        // 4. Circumference
        // System.out.print("Enter radius: ");
        // circumference(sc.nextFloat());

        // 5. Voting eligibility
        // System.out.print("Enter age: ");
        // isEligibleToVote(sc.nextInt());

        // 6. Infinite loop (use with caution!)
        // infiniteLoop();

        // 7. Power function
        // System.out.print("Enter base and exponent: ");
        // double result = calculatePower(sc.nextInt(), sc.nextInt());
        // System.out.println("Result: " + result);

        // 8. GCD
        // System.out.print("Enter two numbers for GCD: ");
        // int resultGCD = gcd(sc.nextInt(), sc.nextInt());
        // System.out.println("GCD: " + resultGCD);

        sc.close();
    }
}


