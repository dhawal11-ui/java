public class BackTracking {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically upp
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("___________Chess Board_______");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);

            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                ; // function call
                board[row][j] = 'x'; // backtracking step
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("solution is possible");

        } else {
            System.out.println("solution is not possible");
        }

    }

}

// Tc = O(n**n) -- without isSafe
// Tc = O(n!) -- with isSafe -- T(n) = 1QueenPlace * T(n-1) + isSafe() ... Time
// required for all of this is our requerence relation.

// If we asked to find the number of ways so base case per jakr (count variable)
// ++ krte jaoooo.
