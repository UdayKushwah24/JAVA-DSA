/* 
            *  *  *  *  *  *  *  *  *
            *  *  *  *     *  *  *  *
            *  *  *           *  *  *
            *  *                 *  *
            *                       *
            *  *                 *  *
            *  *  *           *  *  *
            *  *  *  *     *  *  *  *
            *  *  *  *  *  *  *  *  *
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2+1;
        int space = 1;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i <= star ){
                System.out.print("*  ");
                i++;
            }

            int j = 2;
            while(j < space){
                System.out.print("   ");
                j++;
            }
            int k = 1;
            if(row == 1 || row == n) {
                k = 2;
            }
            while(k <= star) {
                System.out.print("*  ");
                k++;
            }
            System.out.println();
            if(row <= (n/2)  ){
                star--;
                space +=2;
            } else {
                star++;
                space -= 2;
            }
            row++;
        }
        sc.close(); 
    }
}
