/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the GCD of N1 and N2. Print the value returned.

Input Format
Two integers seperated by a new line.

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Output Format
Output a single integer which is the GCD of the given integers.

Sample Input
16 
24
Sample Output
8
Explanation
The largest number that divides both N1 and N2 is called the GCD of N1 and N2.
  */
package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class GCDnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int factor = 0;
        for (int i = 1; i <= Math.min(N1, N2); i++) {
            if((N1%i==0) && (N2%i==0)) {
                factor = Math.max(factor,i);
            }
        }
        System.out.println(factor);
        sc.close();
    }
}
