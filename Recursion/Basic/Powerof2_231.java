// Time Complexity : O(n)

package Recursion.Basic;

public class Powerof2_231 {

    //Approach 1 : Using Bit Magic
    /* public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        if((n & (n-1)) == 0) {
            return true;
        } 
        return false;
    } */


    //Approach 2 : using recursion
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        if(n == 1) {
            return true;
        } 

        if(n%2 == 1) return false;
        return isPowerOfTwo(n/2);
    }


    //Approach 3 : using divide rule
    /* public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        while(n != 1) {
            if(n%2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    } */

    public static void main(String[] args) {
        int n = 84;
        System.out.println(isPowerOfTwo(n));
    }
}
