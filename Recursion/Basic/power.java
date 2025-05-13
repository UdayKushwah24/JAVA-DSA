/* 
Time Complexity : O(n)
recursive eqn : f(a,n) = a*f(a,n-1)

*/

package Recursion.Basic;

public class power {

    public static int calc_power(int a, int n) {
        //base case
        if(n == 0) {
            return 1;
        }

        int anm1 = calc_power(a, n-1);
        return a*anm1;

    }
    public static void main(String[] args) {
        int a = 3;
        int n = 4;
        System.out.println(calc_power(a, n));
    }
}
