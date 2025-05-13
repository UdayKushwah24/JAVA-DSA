/* 
the outcome not contain two consecutive head like HHT, HHH.
Ouput :  THTH
         THTT
         TTHT
         TTTH
         TTTT

 */

package Recursion.Medium;

public class CoinNotTwoHead {

    public static void notPairHead(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {

            notPairHead(n - 1, ans + "H");
        }
        notPairHead(n - 1, ans + "T");
    }

    public static void main(String[] args) {
        int n = 3;
        notPairHead(n, "");
    }
}
