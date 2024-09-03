/* 
                            1 
                         1  2  3 
                      1  2  3  4  5 
                   1  2  3  4  5  6  7 
                1  2  3  4  5  6  7  8  9 
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_26 {
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
                System.out.print("   ");
                i++;
            }
            int j = 1;
            int val = 1;
            while(j <= star) {
                System.out.printf("%2d",val);

                System.out.print(" ");
                val++;
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
