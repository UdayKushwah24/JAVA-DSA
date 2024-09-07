/* 
                1 
                2 3 
                4 5 6 
                7 8 9 10
 */
package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class NumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int column = 1; 
        int val = 1;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while (i <= column) {
                System.out.print(val+" ");
                val++;
                i++;
            }
            System.out.println();
            row++;
            column++;
        }
        sc.close();
    }
}
