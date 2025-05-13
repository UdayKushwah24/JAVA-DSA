package Recursion.RecursionPractice;

public class q12_QueenPermutation {

    public static void QueenPermutation(boolean[] board , int queen, int i, String ans) {
        if(queen == i) {
            System.out.println(ans);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(board[j] == false) {
                board[j] = true;
                QueenPermutation(board , queen, i+1, ans+"b"+j+"q"+(i+1)+" ");
                board[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        int boardSize = 4;
        int queen = 2;
        boolean[] board = new boolean[boardSize];
        QueenPermutation(board, queen, 0, "");
        for (int i = 0; i < board.length; i++) {
            System.out.println(board[i]+" ");
        }
    }       
}
