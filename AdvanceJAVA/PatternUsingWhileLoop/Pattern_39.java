/* 
                        1
                      2 2 2
                    3 3 3 3 3
                  4 4 4 4 4 4 4
                5 5 5 5 5 5 5 5 5
                  4 4 4 4 4 4 4
                    3 3 3 3 3
                      2 2 2
                        1
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int row = 1;
        int star = 1;
        int val = 1;
        while (row <= 2*n-1) {
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }
            
            int j = 1;
            while (j <= star) {
                System.out.print(val+" ");
                j++;
            }
            
            if(row < n) {
                star += 2;
                space--;
                val++;
            } else {
                star -= 2;
                space++;
                val--;
            }

            System.out.println();
            row++;
        }
        sc.close();
    }
}
