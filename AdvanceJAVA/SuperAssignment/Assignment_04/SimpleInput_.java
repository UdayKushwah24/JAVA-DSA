/* 
Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

Input Format
A list of integers to be processed

Constraints
All numbers input are integers between -1000 and 1000.

Output Format
Print all the numbers before the cumulative sum become negative.

Sample Input
1
2
88
-100
49

Sample Output
1
2
88
 */

package AdvanceJAVA.SuperAssignment.Assignment_04;

import java.util.Scanner;

public class SimpleInput_ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n1 = sc.nextInt();
            
            int c = 0;
            if(c < 0) {
                return;
            }
            int n2 = sc.nextInt();
            c = n1+n2;
        }
        
    }
}

