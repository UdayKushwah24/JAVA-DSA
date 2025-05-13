package Recursion.RecursionPractice;

public class q5_DiceBoardPath {

    // Dice have three faces : 1, 2, 3
    public static void Dice(int boardSize, int currSum, String ans) {
        if (currSum == boardSize) {
            System.out.println(ans);
            return;
        }
        if (currSum > boardSize) {
            return;
        }
        Dice(boardSize, currSum + 1, ans + 1);
        Dice(boardSize, currSum + 2, ans + 2);
        Dice(boardSize, currSum + 3, ans + 3);
        // for (int face = 1; face <= 3; face++) {
        //     Dice(boardSize, currSum+face, ans+face);
        // }
    }

    public static void main(String[] args) {
        int boardSize = 5; // 1-D board
        Dice(boardSize, 0, "");
    }

}
