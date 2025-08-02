import java.util.Scanner;

/**
 * Demonstrates basic use of conditional statements and switch-case in Java.
 */
public class ConditionalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- IF-ELSE COMPARISON ---
        System.out.print("Enter the value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value for b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }

        System.out.println();

        // --- SWITCH CASE EXAMPLE ---
        System.out.print("Enter a number to compare (1 or 2): ");
        int compare = sc.nextInt();

        switch (compare) {
            case 1:
                System.out.println("You selected option 1: a is lesser");
                break;
            case 2:
                System.out.println("You selected option 2: a is greater");
                break;
            default:
                System.out.println("Invalid selection.");
        }

        sc.close(); // Always close your scanner
    }
}

