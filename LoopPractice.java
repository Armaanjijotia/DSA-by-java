import java.util.*;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st LOOP: FOR LOOP
        System.out.println("FOR LOOP:");
        for (int c = 0; c < 3; c++) {
            System.out.println(c);
        }

        // 2nd LOOP: WHILE LOOP
        System.out.println("\nWHILE LOOP:");
        int i = 1;
        while (i < 4) {
            i++;
            System.out.println(i);
        }

        // 3rd LOOP: DO-WHILE LOOP
        System.out.println("\nDO-WHILE LOOP:");
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 4);

        // Q1) Sum of n natural numbers
        System.out.println("\nQ1) Sum of n natural numbers:");
        int sum = 0;
        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();

        for (int j = 1; j <= n; j++) {
            sum += j;
        }
        System.out.println("Sum = " + sum);

        // Q2) Multiplication table of any number
        System.out.println("\nQ2) Multiplication table:");
        System.out.print("Enter the value for k: ");
        int k = sc.nextInt();

        for (int j = 1; j <= 10; j++) {
            int table = j * k;
            System.out.println(k + " x " + j + " = " + table);
        }

        sc.close();
    }
}
