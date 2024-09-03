/* 
                    1 
                  1 1 1 
                1 1 1 1 1 
              1 1 1 1 1 1 1 
            1 1 1 1 1 1 1 1 1 
*/

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int star = 1;
        int space = n-1;
        int row = 1;

        while(row <= n) {
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= star) {
                System.out.print("1 ");
              
                j++;
            }

            System.out.println();
            row++;
            space--;
            star += 2;

        }
        sc.close();
    }
}
