/* 
Time Complexity : O(n)

recursive eqn : f(n) = n*f(n-1)
Recurence Relation : T(n) = T(n-1) + 1
\\
\
\

 */

package Recursion.Basic;

public class factorial {

    public static int fact(int n) {
        // Base Case or hault case
        if (n == 0) {
            return 1;
        }

        int nm1 = fact(n - 1);
        return n * nm1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
