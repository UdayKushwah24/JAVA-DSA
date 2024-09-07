/* 
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class Nth_fibonacci {
    public static void fibonacciNo(int n) {
        int a = 0;
        int b = 1;
        int count = 2;
        for(int i = 2; i <= n; i++) {
            int c = a + b;
            if( count == n){
            System.out.print(c);
            return; 
            }
            a = b;
            b = c;
            count++;
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciNo(n);
        sc.close();
    }
}
