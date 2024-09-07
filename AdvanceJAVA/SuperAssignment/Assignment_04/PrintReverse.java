/* 
 Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format

Sample Input
123456789

Sample Output
987654321

Explanation
You've to calculate the reverse in a number, not just print the reverse.
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class PrintReverse {
    public static void ReverseNumber(int n) {
        int digits = CountDigit(n);
        int sum = 0;
        while(n > 0) {
            int last_digit = n % 10;
            sum += last_digit* Math.pow(10,digits-1);
            n /= 10;
            digits--;
        }

        System.out.println(sum);
    }

    public static int CountDigit(int n) {
        int count = 0;
        while(n > 0) {
            int remainder = n % 10;
            count++;
            n /= 10;

            System.out.println(remainder);
        }
        return count;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseNumber(n);
        sc.close();
    }
}
