/*  Optimised code
Print x to the power n.
x^n = 2^10 = 1024

Time Complexity : O(log()n)
 */

package Recursion_Problem;

public class Power_Optimized {
    public static int PowerOptimized (int x, int n) {
        if(n == 0) {
            return 1;
        }
        /*
         //two recursive call so time comlexity is O(n)
        int halfPowerSquare = PowerOptimized(x, n/2) * PowerOptimized(x, n/2);  
         */
        int halfPower = PowerOptimized(x, n/2);
        int halfPowerSquare = halfPower*halfPower;
        if(n%2 != 0){
            halfPowerSquare = x*halfPowerSquare;
        }
        return halfPowerSquare;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(PowerOptimized(x, n));
    }
}
