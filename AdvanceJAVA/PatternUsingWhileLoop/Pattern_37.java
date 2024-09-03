/* 
                                * 
                            * *   * * 
                        * * *       * * * 
                    * * * *           * * * * 
                * * * * *               * * * * * 
                    * * * *           * * * * 
                        * * *       * * * 
                            * *   * * 
                                * 
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0) {
            n += 1;
        }
        int Out_space = n-1;
        int In_space = 1;
        int star = 1;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i <= Out_space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            int k = 2;
            while(k < In_space) {
                System.out.print("  ");
                k++;
            }

            int p = 0;
            if(row == 1 || row == n) {
                p = 1;
            }
            while(p < star) {
                System.out.print("* ");
                p++;
            }

            if(row <= n/2) {
                Out_space -= 2;
                In_space += 2;
                star++;
            } else {
                Out_space += 2;
                In_space -= 2;
                star--;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }

}
