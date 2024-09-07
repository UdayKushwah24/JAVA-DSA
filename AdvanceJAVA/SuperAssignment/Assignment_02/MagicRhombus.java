/* 
                *********
                **** ****
                ***   ***
                **     **
                *       *
                **     **
                ***   ***
                **** ****
                *********
 */

package AdvanceJAVA.SuperAssignment.Assignment_02;

import java.util.Scanner;

public class MagicRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int star = n;
        int space = 0;
        int row = 0;
        while(row < (2*n-1)) {
            int i = 1;
            while(i <= star) {
                System.out.print("*");
                i++;
            }

            int j = 1;
            while(j<space) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            if(row == 0 || row == (2*n-2)) {
                k = 2;
            }
            while(k <= star) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            row++;

            if(row < n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }


        }
        sc.close();
    }
}
