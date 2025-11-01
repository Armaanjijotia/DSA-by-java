public class pattern {
    public static void main(String[] args) {

        // ------------------ Pattern 1 ------------------
        // Right-aligned star triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Output:
        //    *
        //   **
        //  ***
        // ****

        System.out.println();

        // ------------------ Pattern 2 ------------------
        // Left-aligned increasing star triangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Output:
        // *
        // **
        // ***
        // ****

        System.out.println();

        // ------------------ Pattern 3 ------------------
        // Inverted star triangle
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Output:
        // ****
        // ***
        // **
        // *

        System.out.println();

        // ------------------ Pattern 4 ------------------
        // Hollow rectangle pattern
        int n = 4, m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Output:
        // *****
        // *   *
        // *   *
        // *****

        System.out.println();

        // ------------------ Pattern 5 ------------------
        // Increasing number triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Output:
        // 1
        // 12
        // 123
        // 1234
        // 12345

        System.out.println();

        // ------------------ Pattern 6 ------------------
        // Inverted number triangle
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Output:
        // 1234
        // 123
        // 12
        // 1

        System.out.println();

        // ------------------ Pattern 7 ------------------
        // Sequential number triangle
        int number = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
        // Output:
        // 1
        // 23
        // 456

        System.out.println();

        // ------------------ Pattern 8 ------------------
        // 0-1 triangle based on (i + j)
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        // Output:
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
    }
}