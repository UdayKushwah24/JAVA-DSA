/* 
Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
2635
Sample Output
11
5
 */
package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class OddEvenPlace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum_even = 0;
        int sum_odd = 0;
        int count = 0;
        while(n > 0) {
            int last_digit = n % 10;
            if(count%2==0) {
                sum_even += last_digit;
            } else {
                sum_odd += last_digit;
            }
            n /= 10;
            count++;
        }
        System.out.print("Even digit sum : ");
        System.out.println(sum_even);
        System.out.print("Odd digit sum : ");
        System.out.println(sum_odd);

        sc.close();
    }
}