
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

public class InvertHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space =2*n-3;
        int row = 1;
        while(row <= n+1) {
            int i = 0;
            while(i < row) {
                System.out.print((n-i)+" ");
                i++;
            }
            int j = 0;
            while(j <= space+1) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(row == n+1) {
                k = 2;
            }
            while( k <= row) {
                System.out.print((n+k-row)+" ");
                k++;
            }
            System.out.println();
            row++;
            space -= 2;
        }
        int spaces = 1 ;
        int rowr = n;
        while(rowr > 0) {
            int i = 0;
            while(i < rowr) {
                System.out.print((n-i)+" ");
                i++;
            }
            int j = 0;
            while(j < spaces) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if(rowr == n+1) {
                k = 2;
            }
            while( k <= rowr) {
                System.out.print((n+k-rowr)+" ");
                k++;
            }
            System.out.println();
            rowr--;
            spaces += 2;
        }
        sc.close();
    }
}
