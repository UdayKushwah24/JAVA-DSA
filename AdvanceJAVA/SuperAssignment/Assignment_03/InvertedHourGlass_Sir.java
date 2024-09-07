/* 
             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class InvertedHourGlass_Sir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int star = 1;
        int space = 2*n-1;
        int row = 1;
        while(row <= 2*n+1) {
            int val = n;
            int i = 1;
            while(i <= star) {
                
                System.out.print(val+" ");
                i++;
                val--;
            }

            int j = 1;
            while(j <= space) {
                
                System.out.print("--");
                j++;
            }

            int k = 1;
            if(row == (n+1)) {
                k = 2;
            }
            while(k <= star){
                System.out.print("* ");
                k++;
            }

            if(row <= n)  {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
