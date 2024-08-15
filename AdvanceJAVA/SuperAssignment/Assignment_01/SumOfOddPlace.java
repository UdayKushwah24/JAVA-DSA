/* 
Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

Input Format
Constraints
0 < N <= 1000000000

Output Format :

Sample Input
2635

Sample Output
11
5

Explanation
5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.

Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11

Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class SumOfOddPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        int N = 2635;
        int oddsum = 0;
        int evensum = 0;
        int place = 1;
        while(N > 0 ) {
            int rem = N % 10;
            if(place%2==0) {
                evensum += rem;
            } else {
                oddsum += rem;
            }
            System.out.println(rem);
            N /= 10;
            System.out.println(N);

            place++;
          
        }
        System.out.println("Odd Sum : "+oddsum);
        System.out.println("Even Sum : "+evensum);
        sc.close();
    }
}
 