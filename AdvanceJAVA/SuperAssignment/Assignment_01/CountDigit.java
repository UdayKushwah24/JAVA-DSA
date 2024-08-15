/* 
Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.

Input Format
Integer (A number) Integer (A digit)

Constraints
0 <= N <= 1000000000 0 <= Digit <= 9

Output Format
Integer (count of times digit occurs in the number)

Sample Input
5433231 
3

Sample Output
3

Explanation
The digit can be from 0 to 9. Assume decimal numbers.In the given case digit 3 is occurring 3 times in the given number.
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = sc.nextInt();
        System.out.print("Enter Digit : ");
        int Digit = sc.nextInt();
        int CountDigit = 0;
        while(N > 0) {
            int remainder = N % 10;
            if(remainder == Digit) {
                CountDigit++;
            }
            N /= 10;
        }
        System.out.print("Total Digit is : ");
        System.out.println(CountDigit);
        sc.close();
    }
}
