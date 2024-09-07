/* 
Given a integer as a input and replace all the '0' with '5' in the integer

Input Format
Enter an integer n

Constraints
0<=n<=1000000000000

Output Format
All zeroes are replaced with 5

Sample Input
102

Sample Output
152

Explanation
Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class Replace_0_by_5 {
    public static long ReplaceZero (long n) {
        long sum = 0;
        int count = 0;
        if(n == 0) {
            return 5;
        }
        while(n > 0) {
            long last_digit = n % 10;
            if(last_digit == 0) {
                sum += 5*Math.pow(10,count);
            } else {
                sum += last_digit*Math.pow(10,count);
            }
            count++;
            n /= 10; 
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long answer = ReplaceZero(n);
        System.out.print(answer);
        sc.close();
    }
}