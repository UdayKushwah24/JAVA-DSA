/* 
                *  *  *  *  *  *
                *              *
                *              *
                *              *
                *              *
                *  *  *  *  *  *
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i <= n) {
                if(row == 1 || row ==n || i == 1 || i == n) {
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
