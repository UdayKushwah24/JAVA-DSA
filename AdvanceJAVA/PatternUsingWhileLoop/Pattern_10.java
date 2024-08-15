/* 
            *  *  *  *  *  *  *  *  *  *  *
               *  *  *  *  *  *  *  *  *
                  *  *  *  *  *  *  *
                     *  *  *  *  *
                        *  *  *
                           *
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2*n-1;
        int space = 1;
        int row = 1;
        while(row <= n) {
            int j = 1;
            while (j < space) {
                System.out.print("   ");
                j++;
            }

            int i = 1;
            while(i <= star) {
                System.out.print("*  ");
                i++;
            }
            
            System.out.println();
            star -= 2; 
            space++;
            row++;
        }
        sc.close();
    }
}
