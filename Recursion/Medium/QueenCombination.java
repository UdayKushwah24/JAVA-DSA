package Recursion.Medium;

public class QueenCombination {
    

    public static void Combination(boolean[] board, String ans, int queen, int qpsf,int idx) { // qpsf : queen placed so far
        if (qpsf == queen) {
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Combination(board, ans + " b" + i + "q" + qpsf+" ", queen, qpsf + 1,i+1);
                board[i] = false; // Back-Tracking concept (undo kar rhe hai)
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // no of boxes
        boolean[] board = new boolean[n];
        int queen = 2; // no. of queen
        Combination(board, "", queen, 0,0);
       
    }
}
