/* 
                 1
               2 3 2
             3 4 5 4 3
           4 5 6 7 6 5 4
         5 6 7 8 9 8 7 6 5
 */
package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 4;
        int space = n-1;
        int star = 1;
        int row = 1;
        int val = 1;
        while(row <= n) {
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            } 
            int p = val;
            int j = 1;
            while(j <= star) {
                System.out.printf("%2d",p);
                //Vertical mirroring 
                if(j <= star/2) {
                    p++;
                } else {
                    p--;
                }
                j++;
            }
            val++;
            
            System.out.println();
            row++;
            space--;
            star += 2;
        }
        sc.close();
    }
}
