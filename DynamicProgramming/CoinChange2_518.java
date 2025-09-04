package DynamicProgramming;

import java.util.Arrays;

public class CoinChange2_518 {
   /*  
   public static int coin_change(int amount, int[] coins, int i, int[][] dp) {
      if (amount == 0) {
          return 1;
      }
      if (i == coins.length) {
          return 0;
      }
      if (dp[amount][i] != -1) {
          return dp[amount][i];
      }
      int inc = 0, exc = 0;
      if (amount >= coins[i]) {
          inc = coin_change(amount- coins[i],coins, i, dp);
      }
      exc = coin_change(amount, coins, i + 1, dp);
      return dp[amount][i] = inc + exc;
   
   }
   public static void main(String[] args) {
      int amount = 5;
      int[] coins = { 1, 2, 5 };
      int dp[][] = new int[amount+1][coins.length];
      for (int a[] : dp) {
          Arrays.fill(a, -1);
      }
      System.out.println(coin_change(amount, coins, 0, dp));
   } */
   
    public static int coin_change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {  // coin
            for (int am = 1; am < dp[0].length; am++) {  // amount
                int inc = 0, exc = 0;
                if (am >= coins[i - 1]) {
                    inc =  dp[i][am - coins[i - 1]];
                }
                exc = dp[i - 1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
        
    }
    
    public static int Change_IIBU(int[] coin, int amount) {
        int[][] dp = new int[coin.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {// coin
            for (int am = 1; am < dp[0].length; am++) {
                int inc = 0, exc = 0;
                if (am >= coin[i - 1]) {
                    inc = dp[i][am - coin[i - 1]];
                }
                exc = dp[i - 1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

   public static void main(String[] args) {
       int amount = 5;
       int[] coins = { 1, 2, 5 };
        System.out.println(coin_change(amount, coins));
   }
}
