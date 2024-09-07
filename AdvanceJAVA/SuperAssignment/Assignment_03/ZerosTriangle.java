/* 
                    1
                    2       2
                    3       0       3
                    4       0       0       4
                    5       0       0       0       5
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class ZerosTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int row = 1;
        while(row <= n) {
            int i = 1;
            while(i<=row) {
                if(i == row || i == 1) {
                    System.out.print(row+"\t");
                } else {
                    System.out.print("0\t");
                }
                i++;
            }
            row++;
            System.out.println();
        }
        sc.close();
    }
}
