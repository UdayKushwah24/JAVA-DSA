//Question URL : https://codeforces.com/problemset/problem/1/A

/* 
A. Theatre Square
time limit per test1 second
memory limit per test256 megabytes
Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

Input
The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

Output
Write the needed number of flagstones.

Examples
Input
6 6 4
Output
4

 */

package AdvanceJAVA.CodeForcesProblem;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long VerticalTiles = (n+a-1)/a;
        long horizontalTiles = (m+a-1)/a;
        System.out.println(VerticalTiles*horizontalTiles);

        // if(n % a == 0 || m % a == 0) {
        //     System.out.println((n/a)*(m/a));
        // } else if (n % a > 0 || m % a > 0) {
        //     System.out.println((((n/a)+1)*((m/a)+1)));
        // }
        sc.close();
    }
}
