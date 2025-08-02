/**
 * A collection of advanced star and number patterns using nested loops in Java.
 */
public class AdvancedPatternExamples {
    public static void main(String[] args) {
        int n = 5; // Change to control pattern size

        // -------------------------------------------------------------------------
        // 1. Hourglass Star Pattern
        // *
        // **    **
        // ***  ***
        // ********
        // ***  ***
        // **    **
        // *      *
        System.out.println("1. Hourglass Star Pattern");
        for (int i = 1; i <= n; i++) {
            printHourglassLine(i, n);
        }
        for (int i = n - 1; i >= 1; i--) {
            printHourglassLine(i, n);
        }

        // -------------------------------------------------------------------------
        // 2. Right-Aligned Rectangle Pattern
        //     *****
        //    *****
        //   *****
        //  *****
        // *****
        System.out.println("\n2. Right-Aligned Rectangle Pattern");
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printStars(5);
            System.out.println();
        }

        // -------------------------------------------------------------------------
        // 3. Hollow Rectangle Triangle Pattern
        //     ****
        //    *  *
        //   *  *
        //  *  *
        // ****
        System.out.println("\n3. Hollow Rectangle Triangle Pattern");
        int m = 4;
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // -------------------------------------------------------------------------
        // 4. Number Pyramid Pattern
        //     1
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        System.out.println("\n4. Number Pyramid Pattern");
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // -------------------------------------------------------------------------
        // 5. Palindromic Number Pyramid
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        System.out.println("\n5. Palindromic Number Pyramid");
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // -------------------------------------------------------------------------
        // 6. Diamond Star Pattern
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("\n6. Diamond Star Pattern");
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            printStars(2 * i - 1);
            System.out.println();
        }
    }

    // Helper method for printing spaces
    private static void printSpaces(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }

    // Helper method for printing stars
    private static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("*");
        }
    }

    // Helper for hourglass pattern line
    private static void printHourglassLine(int i, int n) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Middle spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }
        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


