/* 
                *                 *
                   *           *
                      *     *
                         *
                      *     *
                   *           *
                *                 *
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i <= n) {
                if(row==i || (i+row) == (n+1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
                i++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
