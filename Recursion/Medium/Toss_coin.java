/* 
Time Complexity : O(n^2)
 n == 3
        HHH
        HHT
        HTH
        HTT
        THH
        THT
        TTH
        TTT
 */

package Recursion.Medium;

public class Toss_coin {

    // public static void CoinToss(int n, String ans) {
    //     if(n == 0){
    //         System.out.println(ans);
    //         return;
    //     }

    //     CoinToss(n-1, ans+"H");
    //     CoinToss(n-1, ans+"T");
    // }


    //count the no. of possible outcomes
    public static int CountCoinToss(int n, String ans) {
        if(n == 0){
            System.out.println(ans);
            return 1;
        }

        int a1 = CountCoinToss(n-1, ans+"H");
        int a2 = CountCoinToss(n-1, ans+"T");
        return a1+a2;
    }

    public static void main(String[] args) {
        int n = 3;
        // CoinToss(n,"");        
        System.out.println(CountCoinToss(n,""));
    }
}
