/* 
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Sample Input
4545

Sample Output
4444

Explanation
There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;

import java.util.Scanner;

public class ChewbaccaNum {
    public static void InvertingDigit(int n) {
        int sum = 0;
        int count = 0;
        while(n > 0) {
            int last_digit = n % 10;
            int invert_digit = (9-last_digit);
            if(invert_digit < last_digit) sum += (invert_digit*Math.pow(10,count));
            else sum +=  (last_digit*Math.pow(10,count));
            count++;
            n /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InvertingDigit(n);
        sc.close();
    }
}
