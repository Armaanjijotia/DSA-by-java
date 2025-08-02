import java.util.Scanner;

/**
 * Demonstrates array input, output, and linear search on student names.
 */
public class ArrayExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Input: Number of students ---
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Clear the newline after nextInt()

        // --- Input: Student names ---
        String[] names = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // --- Output: All student names ---
        System.out.println("\nList of students:");
        for (String name : names) {
            System.out.println(name);
        }

        // --- Input: Name to search ---
        System.out.print("\nEnter name to search: ");
        String targetName = sc.nextLine();

        // --- Linear search for the name ---
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(targetName)) {
                System.out.println("Name found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found.");
        }

        sc.close(); // Close the Scanner
    }
}

