/* 
            1                   1
            1 2               2 1
            1 2 3           3 2 1
            1 2 3 4       4 3 2 1
            1 2 3 4 5   5 4 3 2 1
            1 2 3 4 5 6 5 4 3 2 1
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class MountainNum {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     int n  = 4;
    //     int space = 2*n-3;
    //     int star = 1;
    //     int row = 1;
    //     while(row <= n) {
    //         int i = 1;
    //         int val = 1;

    //         while (i <= star) {
    //             System.out.print(val+" ");
    //             i++;
    //             val++;
    //         }

    //         int j = 1;
    //         while(j <= space) {
    //             System.out.print("--");
    //             j++;
    //         }

    //         int k = 1;
    //         if(row == n) {
    //             k = 2;
    //         }
    //         while (k <= star) {
    //             System.out.print(val+" ");
    //             if(k < space/2) {
    //                 val++;
    //             } else {
    //                 val--;
    //             }
    //             k++;
    //         }
    //         System.out.println();
    //         space -= 2;
    //         star++;
    //         row++;
    //     }
    //     sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n  = 4;
        int space = 2*n-3;
        int star = 1;
        int row = 1;
        while(row <= n) {
            int i = 1;
            int val = 1;

            while (i <= star) {
                System.out.print(val+" ");
                i++;
                val++;
            }

            int j = 1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }

            int k = 1;
            if(row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print((row-k+1)+" ");
                k++;
            }
            System.out.println();
            space -= 2;
            star++;
            row++;
        }
        sc.close();
    }
}
