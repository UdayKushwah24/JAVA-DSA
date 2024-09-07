/* 
 Take the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Constraints
0 < N1 < 100 N1 < N2 < 10000

Output Format
Sample Input
400
1000

Sample Output
407

Explanation
Each number in output is in separate line.
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class Armstrong {
    
    public static void checkArmstrong(int n) {
        int digits = CountDigits(n);
        int sum = 0;
        int num = n;
        while(n > 0) {
            int last_digit = n % 10;
            sum += Math.pow(last_digit,digits);
            n /= 10;
        }
        if(num == sum)
        System.out.println(sum);
    }

    public static int CountDigits(int n) {
        int count = 0;
        while(n > 0) {
            int last_digit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1; i <= n2; i++) {
            checkArmstrong(i);
        }

       
        sc.close();
    }
}
