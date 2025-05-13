package Recursion.Medium;

public class Move {

    public static void HorizontalVerticalMove(int row,int col,int hor,int ver,String ans) {
        if(ver == row && col == hor) {
            System.out.println( ans);
            return;
        }
        if(hor > col || ver > row) {
            return;
        }
        HorizontalVerticalMove(row, col, hor+1, ver, ans+'H');
        HorizontalVerticalMove(row, col, hor, ver+1, ans+'V');
    }

    public static int CountMove(int row,int col,int hor,int ver,String ans) {
        if(ver == row && col == hor) {
            return 1;
        }
        if(hor > col || ver > row) {
            return 0;
        }
        int c1 = CountMove(row, col, hor+1, ver, ans+'H');
        int c2 = CountMove(row, col, hor, ver+1, ans+'V');
        return c1+c2;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        HorizontalVerticalMove(row-1, col-1, 0, 0, "");
        System.out.println(CountMove(row-1, col-1, 0, 0,""));
    }
}
