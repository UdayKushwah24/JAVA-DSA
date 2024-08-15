/* 
                           *
                        *     *
                     *           *
                  *                 *
               *                       *
            *                             *  
               *                       *
                  *                 *
                     *           *
                        *     *
                           *
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            n = n+1;
        }
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i <= n) {
                if(row+i == (n/2+2) || row-i == n/2 || i-row == n/2|| i+row == (3*n/2)+1){
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
