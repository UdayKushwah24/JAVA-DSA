/* 
Time Complexity = O(n)
Space Complexity = O(n)
 */
package Recursion_Problem;

public class Factorial {
    public static int findFactorial(int n) {
        if(n == 1 || n == 0) {
            
            return 1;
        }
        int factnm1 = findFactorial(n-1);
        return (n*factnm1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
}
