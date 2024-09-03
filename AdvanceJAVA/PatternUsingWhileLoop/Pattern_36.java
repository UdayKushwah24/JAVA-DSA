/* 
            * * * * * * * * * * * 
              * * * * * * * * *
                * * * * * * *
                  * * * * *
                    * * *
                      *
                    * * *
                  * * * * *
                * * * * * * *
              * * * * * * * * *
            * * * * * * * * * * *
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int space = 1;
        int star = 2*n+1;
        int row = 1;
        while(row <= 2*n+1) {
            int i = 1;
            while(i < space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            if(row <= n) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }

            System.out.println();
            row++;
        }
        sc.close();
    }
}
