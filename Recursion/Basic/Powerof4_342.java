// Time Complexity : O(n)

package Recursion.Basic;

public class Powerof4_342 {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 4 != 0)
            return false;

        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        int n = 60;
        System.out.println(isPowerOfFour(n));
    }
}
