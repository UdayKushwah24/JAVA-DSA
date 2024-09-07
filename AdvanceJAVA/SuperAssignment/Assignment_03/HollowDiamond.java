/* 
            * * * * * * * * * 
            * * * *   * * * *
            * * *       * * *
            * *           * *
            *               *
            * *           * *
            * * *       * * *
            * * * *   * * * * 
            * * * * * * * * *
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 9;
        int space = -1;
        int star = n/2+1;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i<=star) {
                System.out.print("* ");
                i++;
            }

            int j = 1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }

            int k = 1;
            if(row == 1 || row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            //mirroring 
            if(row <= n/2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            //next line preparation
            System.out.println();
            row++;
        }
        sc.close();
    }
}
