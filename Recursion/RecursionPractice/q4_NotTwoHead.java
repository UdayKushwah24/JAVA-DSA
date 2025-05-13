package Recursion.RecursionPractice;

public class q4_NotTwoHead {
    public static void main(String[] args) {
        int coin = 4;
        TossCoin(coin, "");
    }

    public static void TossCoin(int coin, String ans) {
        if (coin == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            TossCoin(coin - 1, ans + "H");
        }
        TossCoin(coin - 1, ans + "T");
    }
}
