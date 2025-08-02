import java.util.Scanner;

/**
 * A program to demonstrate basic operations with 2D arrays in Java:
 * - Input a matrix of integers
 * - Print the matrix
 * - Search for a specific number and print its position(s)
 */
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] marks = new int[row][col];

        // Input matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a number
        System.out.print("\nEnter the number you want to search for: ");
        int x = sc.nextInt();

        boolean found = false;
        System.out.println("\nSearching for " + x + ":");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (marks[i][j] == x) {
                    System.out.println("Found at position [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number " + x + " not found in the array.");
        }

        sc.close(); // Always good to close Scanner
    }
}



