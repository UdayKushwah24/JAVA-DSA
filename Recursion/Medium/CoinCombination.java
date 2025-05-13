package Recursion.Medium;

public class CoinCombination {

    public static void Combination(int[] coin, int amount, String ans, int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                Combination(coin, amount - coin[i], ans + coin[i], i); // i -> infinite no. of coin supply         i+1 -> finite no. of coin supply
            }
        }
    }

    public static void main(String[] args) {
        int[] coin = { 2, 3, 5 };
        int amount = 8;
        Combination(coin, amount, "", 0);
    }
}
