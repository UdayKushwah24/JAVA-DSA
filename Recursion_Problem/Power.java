/* 
Print x to the power n.
x^n = 2^10 = 1024

Time Complexity : O(n)
 */

package Recursion_Problem;

public class Power {
    public static int pow(int x, int n){
        // if(n == 1){
        //     return x;
        // }
        if(n == 0){      //x^0 == 1
            return 1;
        }
        int xnm1 = pow(x,n-1);
        int xn = x * xnm1;
        return xn;
        // return x * pow(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(pow(x, n));
    }
}
