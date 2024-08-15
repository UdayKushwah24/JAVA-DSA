/* 
Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *
Input Format
Constraints
0 < N < 10 (only odd numbers allowed)

Output Format
Sample Input
5

Sample Output
      *
    * * *
  * * * * *
    * * *
      *
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class MirrorPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2;
        int space = 1;
        int row = 1;
        while(row <= n) {
            int k = 1;
            while(k <= star) {
                System.out.print("  ");
                k++;
            }
            
            int i = 1;
            while(i <= space) {
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j <= star) {
                System.out.print("  ");
                j++;
            }

            System.out.println();
            if(row <= n/2) {
                star--;
                space += 2;
            } else {
                star++;
                space -=2;
            }
            row++;
        }
        sc.close();
    }
}
