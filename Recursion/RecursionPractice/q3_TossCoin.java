package Recursion.RecursionPractice;

public class q3_TossCoin {

    // contains only two head and two tails
    public static void CoinTosses(int n, int head, int tail, String ans) {
        if (head == n && tail == n) {
            System.out.println(ans);
            return;
        }
        if (head > n || tail > n) {
            return;
        }
        CoinTosses(n, head + 1, tail, ans + "H");
        CoinTosses(n, head, tail + 1, ans + "T");
    }

    // contains all possible outcomes
    public static void CoinToss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        CoinToss(n - 1, ans + "H");
        CoinToss(n - 1, ans + "T");
    }

    public static void main(String[] args) {
        int n = 4;
        // CoinToss(n, "");
        // contains same no of head and tail
        CoinTosses(n - n / 2, 0, 0, "");

    }

}
