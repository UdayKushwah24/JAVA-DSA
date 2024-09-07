/* 
            5 4 3 2 1 0 1 2 3 4 5
              4 3 2 1 0 1 2 3 4 
                3 2 1 0 1 2 3 
                  2 1 0 1 2 
                    1 0 1 
                      0 
                    1 0 1 
                  2 1 0 1 2 
                3 2 1 0 1 2 3 
              4 3 2 1 0 1 2 3 4 
            5 4 3 2 1 0 1 2 3 4 5
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class HourGlass_Sir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int space = 1;
        int star = 2*n+1;
        int row = 1;
        int val  = 5;
        while(row <= 2*n+1) {
            int i = 1;
            while(i < space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            int p = val;
            while(j <= star) {
                System.out.print(p+" ");
                if(j <= star/2) p--;
                else p++;
                j++;
            }
            if(row <= n) {
                space++;
                val--;
                star -= 2;
            } else {
                val++;
                space--;
                star += 2;
            }

            System.out.println();
            row++;
        }
        sc.close();
    }
}
