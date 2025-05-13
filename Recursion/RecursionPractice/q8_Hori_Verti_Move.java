package Recursion.RecursionPractice;

public class q8_Hori_Verti_Move {
    // cr -> current row, cc -> current column  
    /* public static void Move(int row, int col, int cr, int cc, String ans) {
        if(cc == col && cr == row) {
            System.out.println(ans);
            return;
        }
        if(cr > row || cc > col) {
            return;
        }
        Move(row, col, cr+1, cc, ans+"H");
        Move(row, col, cr, cc+1, ans+"V");
    } */

    public static void Move(int row, int col, int cr, int cc, String ans) {
        if(cc == col && cr == row) {
            System.out.println(ans);
            return;
        }
        if(cr < row) {
            Move(row, col, cr+1, cc, ans+"H");
        }
        if(cc < col) {
            Move(row, col, cr, cc+1, ans+"V");
        }
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        Move(row-1, col-1, 0, 0, "");
    }
}
