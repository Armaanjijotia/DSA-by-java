import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------ 1. FOR LOOP ------------------
        System.out.println("FOR LOOP:");
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        // ------------------ 2. WHILE LOOP ------------------
        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j < 4) {
            System.out.println("j = " + j);
            j++;
        }

        // ------------------ 3. DO-WHILE LOOP ------------------
        System.out.println("\nDO-WHILE LOOP:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 4);

        // ------------------ Q1. Sum of n natural numbers ------------------
        System.out.println("\nQ1) Sum of n natural numbers");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        // ------------------ Q2. Multiplication Table ------------------
        System.out.println("\nQ2) Multiplication table");
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close(); // Always good to close the Scanner
    }
}

