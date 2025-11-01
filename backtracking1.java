                                            // 4--> QUEEN  
                                            
public class backtracking1 {
    static int size = 4;  // Size of the board (4x4)

    // This function prints the chess board
    static void printBoard(int[][] board) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // If there's a queen, print Q, else print .
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();  // Go to next line
        }
        System.out.println();  // Extra line between solutions
    }

    // This function checks if it's safe to place a queen
    static boolean isSafe(int[][] board, int row, int col) {
        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < size; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;  // Safe to place the queen
    }

    // This function tries to place queens one by one
    static boolean placeQueens(int[][] board, int row) {
        if (row == size) {
            // All 4 queens placed, print the board
            printBoard(board);
            return true;
        }

        // Try placing queen in every column of this row
        for (int col = 0; col < size; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;  // Place queen
                if (placeQueens(board, row + 1)) {
                    return true;  // Stop if one solution is enough
                }
                board[row][col] = 0;  // Remove queen (backtrack)
            }
        }

        return false;  // No place found in this row
    }

    public static void main(String[] args) {
        int[][] board = new int[size][size];  // 4x4 board
        boolean solved = placeQueens(board, 0);
        if (!solved) {
            System.out.println("No solution found.");
        }
    }

}
