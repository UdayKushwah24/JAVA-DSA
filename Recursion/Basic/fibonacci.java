/* 
Time Complexity : Big-Oh(2^n)

Recursive Eqn : f(n) = f(n-1)+f(n-2)
 */

package Recursion.Basic;

public class fibonacci {

    public static int fibonaccii(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fibonaccii(n - 1);
        int f2 = fibonaccii(n - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonaccii(n));
    }
}