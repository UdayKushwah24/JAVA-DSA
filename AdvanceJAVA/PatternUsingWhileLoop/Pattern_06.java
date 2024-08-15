/* 
            *  *  *  *  *
                  *  *  *  *
                        *  *  *
                              *  *
                                   *
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 1;
        int star = n;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i < space) {
                System.out.print("      ");
                i++;
            }
            int j = 1;
            while(j <= star) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            row++;
            star--;
            space++;
        }
        sc.close();
    }

}
