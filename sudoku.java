public class sudoku {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check the current row and column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(number + '0')) {    //'0' is 48 in ASII 
                return false;                 // it is not a integer it is char number is 7 (7+48)=55 
            }
            if (board[row][i] == (char)(number + '0')) {
                return false;
            }
        }
        // Check the 3x3 sub-grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }
    public boolean helper(char[][] board, int row, int col) {
    if (row == 9) {
        return true; // Board is completely filled
    }
    // Easy to read step-by-step version
    int nextRow = row;
    int nextCol = col + 1;

    if (col == 8) {
        nextRow = row + 1;
        nextCol = 0;
    }

    if (board[row][col] != '.') {
        return helper(board, nextRow, nextCol); // Use nextRow, nextCol here
    }

    for (int i = 1; i <= 9; i++) {
        if (isSafe(board, row, col, i)) {
            board[row][col] = (char)(i + '0');
            if (helper(board, nextRow, nextCol)) {
                return true;
            } else {
                board[row][col] = '.'; // backtrack
            }
        }
    }

    return false; // No valid number found
}

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // Utility method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the solver
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        sudoku s = new sudoku();
        System.out.println("Original Sudoku:");
        printBoard(board);

        s.solveSudoku(board);

        System.out.println("\nSolved Sudoku:");
        printBoard(board);
    }
}
