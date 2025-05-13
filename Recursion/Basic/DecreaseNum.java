// Time Complexity : O(n)

package Recursion.Basic;

public class DecreaseNum {
    public static void PrintDec(int n) {
        // Base Case or hault case
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        PrintDec(n);
    }
}
