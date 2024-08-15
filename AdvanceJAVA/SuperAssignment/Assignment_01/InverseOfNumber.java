/* 
Take the following as input.
A number
Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.

Write a function that returns its inverse, where inverse is defined as follows

Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, 
therefore in 12543, “2” is at 4th place.

Print the value returned.

Input Format
Integer

Constraints
0 < N < 1000000000

Output Format
Integer

Sample Input
32145
Sample Output
12543
Explanation
Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place,
therefore in 12543, “2” is at 4th place.
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number
        int number = sc.nextInt();
        sc.close();
        
        // Variable to store the inverse number
        int inverse = 0;
        int position = 1;
        
        // Loop through the digits of the number
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            number /= 10;             // Remove the last digit
            
            // Place the current position at the index of the digit in the inverse number
            inverse += position * Math.pow(10, digit - 1);
            
            position++;
        }
        
        // Output the inverse number
        System.out.println(inverse);
    }
}
