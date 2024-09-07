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
package AdvanceJAVA.SuperAssignment.Assignment_03;
// import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        int n = 5;
        int space = -1;
        int star = n;
        int row = 1;
        while(row <= (2*n-1)) {
            int i = 1;
            while(i <= star ) {
                System.out.print("*");
                i++;
            }

            int j = 1;
            while(j <= space) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            if(row == 1 || row == (2*n-1)) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("*");
                k++;
            }
            if(row < n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            row++;
            System.out.println();
        }
    }
}

