//Question URL : https://codeforces.com/problemset/problem/2010/B
/* 
B. Three Brothers
time limit per test1 second
memory limit per test256 megabytes
Three brothers agreed to meet. Let's number the brothers as follows: the oldest brother is number 1, the middle brother is number 2, and the youngest brother is number 3.

When it was time for the meeting, one of the brothers was late. Given the numbers of the two brothers who arrived on time, you need to determine the number of the brother who was late.

Input
The first line of input contains two different integers a and b (1 ≤ a, b ≤ 3, a ≠ b) — the numbers of the brothers who arrived on time. The numbers are given in arbitrary order.

Output
Output a single integer — the number of the brother who was late to the meeting.

Example
InputCopy
3 1
OutputCopy
2
 */

package AdvanceJAVA.CodeForcesProblem;

import java.util.Scanner;

public class ThreeBrother {

    // Solution 01
    
    // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     if(a >= 1 && b <= 3 && a!=b) {
            //         if(a == 1 && b == 2) System.out.println(3);
            //         else if(a == 2 && b == 3) System.out.println(1);
            //         else System.out.println(2);
            //     }
            //     sc.close();
            // }
            
            
    // Solution 02
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= 1 && b <= 3 && a!=b) {
            System.out.println(6-(a+b));
        }
        sc.close();
    }
}
