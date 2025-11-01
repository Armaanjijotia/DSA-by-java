import java.util.*;

// public class TwoDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Input for rows and columns
//         System.out.print("Enter the number of rows: ");
//         int row = sc.nextInt();
        
//         System.out.print("Enter the number of columns: ");
//         int col = sc.nextInt();
        
//         int[][] marks = new int[row][col];

//         // Input elements into the array
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
//                 marks[i][j] = sc.nextInt();
//             }
//         }

//         // Output the 2D array
//         System.out.println("\nThe 2D array is:");
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(marks[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close(); // Always good to close the Scanner
//     }
// }


public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for rows and columns
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        
        int[][] marks = new int[row][col];

        // Input elements into the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("enter the number which u want to detect: ");
         int x=sc.nextInt();
        // Output the 2D array
   
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(x==marks[i][j]){
                    System.out.print("X found at [" + i + "][" + j + "]: ");

                }
            }
            System.out.println();
        }
        
        
    }
}

