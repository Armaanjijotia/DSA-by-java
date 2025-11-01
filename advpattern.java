public class advpattern {
    public static void main(String[] args) {
        int n = 5; // You can change this value to control the size of patterns

        // ------------------------------------------------------------------------------------
        // 1. Hourglass Star Pattern
        // Output:
        // *      *
        // **    **
        // ***  ***
        // ********
        // ***  ***
        // **    **
        // *      *
        System.out.println("1. Hourglass Star Pattern");
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ------------------------------------------------------------------------------------
        // 2. Right-Aligned Rectangle Pattern
        // Output:
        //     *****
        //    *****
        //   *****
        //  *****
        // *****
        System.out.println("\n2. Right-Aligned Rectangle Pattern");
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print 5 stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ------------------------------------------------------------------------------------
        // 3. Hollow Rectangle Triangle Pattern
        // Output:
        //     ****
        //    *   *
        //   *   *
        //  *   *
        //  ****
        System.out.println("\n3. Hollow Rectangle Triangle Pattern");
        int m = 4;
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Hollow rectangle
            for (int a = 1; a <= m; a++) {
                if (i == 1 || i == n || a == 1 || a == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // ------------------------------------------------------------------------------------
        // 4. Number Pyramid Pattern
        // Output:
        //     1 
        //    2 2 
        //   3 3 3 
        //  4 4 4 4 
        // 5 5 5 5 5 
        System.out.println("\n4. Number Pyramid Pattern");
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Print number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // ------------------------------------------------------------------------------------
        // 5. Palindromic Number Pyramid
        // Output:
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        System.out.println("\n5. Palindromic Number Pyramid");
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // ------------------------------------------------------------------------------------
        // 6. Diamond Star Pattern
        // Output:
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
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
