/* package Recursion;

public class Sudoku {
    public boolean isSafe(char[][] board, int row , int col , int number){
        //row & column
        for(int i = 0;i<board.length;i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;      //sr == starting row
        int sc = (col/3)*3;
        for(int i = sr;i<sr+3;i++){
            for(int j = sc;i<sc+3;j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean helper(char[][] board, int row , int col){
        if(row == board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row +1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            } 
        } else {
            for (int i = 1; i < 10; i++) {
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }            
        }
        return false;
    }
    public void solveSudoku (char[][] board){
       char[][] board = [["5","3",".",".","7",".",".",".","."],
                          ["6",".",".","1","9","5",".",".","."],
                          [".","9","8",".",".",".",".","6","."],
                          ["8",".",".",".","6",".",".",".","3"],
                          ["4",".",".","8",".","3",".",".","1"],
                          ["7",".",".",".","2",".",".",".","6"],
                          [".","6",".",".",".",".","2","8","."],
                          [".",".",".","4","1","9",".",".","5"],
                          [".",".",".",".","8",".",".","7","9"]]; 

        helper(board, 0, 0);
    }
    
}
 */

package Recursion;

public class Sudoku {

    // Check if it is safe to place the number in the given cell
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check the row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        
        // Check the 3x3 grid
        int sr = (row / 3) * 3;  // sr == starting row
        int sc = (col / 3) * 3;  // sc == starting column
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {  // Fixed the inner loop to use j < sc + 3
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // Recursive helper function to solve the Sudoku
    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;  // Base case: If reached the end of the board, Sudoku is solved
        }

        int nrow = row;
        int ncol = col;

        // Move to the next cell
        if (col != board.length - 1) {
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // If the current cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Try placing numbers 1 to 9 in the current cell
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    // Main function to solve the Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
