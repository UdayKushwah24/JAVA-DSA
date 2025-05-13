package Recursion.Medium;

public class QueenPermutation {


    
    /* public static void Permutation(boolean[] board, String ans ,int qpsf) {  //qpsf : queen placed so far
        if(qpsf == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i] == false) {
                board[i] = true;
                Permutation(board, ans+" b"+i+" q"+qpsf , qpsf-1);
                board[i] = false;   //Back-Tracking concept
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;  //no of boxes
        boolean[] board = new boolean[n];
        int queen = 2;  //no. of queen
        Permutation(board,"", queen);
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
    } */



    public static void Permutation(boolean[] board, String ans, int queen, int qpsf) { // qpsf : queen placed so far
        if (qpsf == queen) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Permutation(board, ans + " b" + i + "q" + qpsf+" ", queen, qpsf + 1);
                board[i] = false; // Back-Tracking concept (undo kar rhe hai)
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // no of boxes
        boolean[] board = new boolean[n];
        int queen = 2; // no. of queen
        Permutation(board, "", queen, 0);
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]);
        }
    }
}
