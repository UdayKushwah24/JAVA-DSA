/* 
                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class DoubleArrow {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // int n = 8;
        // if(n%2 == 0) {
        //     n += 1;
        // }
        // int Out_space = n-1;
        // int In_space = -1;
        // int star = 1;
        // int row = 1;
        // while(row <= n) {
        //     int i = 1;
        //     while(i <= Out_space) {
                
        //         System.out.print("  ");
        //         i++;
        //     }
        //     int j = 1;
        //     int val1 = row+1;
            
        //     while (j <= star) {
        //         if(row < n/2) {
        //             val1--;
        //         } else {
        //             val1++;
        //         }
        //         System.out.print(val1+" ");
        //         j++;
        //     }

        //     int k = 1;
        //     while(k <= In_space) {
        //         System.out.print("  ");
        //         k++;
        //     }

        //     int p = 0;
        //     if(row == 1 || row == n) {
        //         p = 1;
        //     }
        //     int val = 1;
        //     while(p < star) {
        //         System.out.print(val+" ");
        //         val++;
        //         p++;
        //     }

        //     if(row <= n/2) {
        //         Out_space -= 2;
        //         In_space += 2;
        //         star++;
        //     } else {
        //         Out_space += 2;
        //         In_space -= 2;
        //         star--;
        //     }
        //     System.out.println();
        //     row++;
        // }
        // sc.close();

        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n = n1/2+1;  // Use n=4 to match the pattern given
            int Out_space = 2 * n - 2;
            int In_space = -1;
            int row = 1;
            while (row <= n) {
                int i = 1;
                while (i <= Out_space) {
                    System.out.print("  ");
                    i++;
                }

                int j = 1;
                int val1 = row;
                while (j <= row) {
                    System.out.print(val1 + " ");
                    val1--;
                    j++;
                }

                int k = 1;
                while (k <= In_space) {
                    System.out.print("  ");
                    k++;
                }

                if (row != 1) {
                    int val2 = 1;
                    int p = 1;
                    while (p <= row) {
                        System.out.print(val2 + " ");
                        val2++;
                        p++;
                    }
                }

                if (row < n) {
                    Out_space -= 2;
                    In_space += 2;
                } else {
                    Out_space += 2;
                    In_space -= 2;
                }
                System.out.println();
                row++;
            }

            row = n - 1;
            Out_space = 2;
            In_space = 2 * row - 3;

            while (row >= 1) {
                int i = 1;
                while (i <= Out_space) {
                    System.out.print("  ");
                    i++;
                }

                int j = 1;
                int val1 = row;
                while (j <= row) {
                    System.out.print(val1 + " ");
                    val1--;
                    j++;
                }

                int k = 1;
                while (k <= In_space) {
                    System.out.print("  ");
                    k++;
                }

                if (row != 1) {
                    int val2 = 1;
                    int p = 1;
                    while (p <= row) {
                        System.out.print(val2 + " ");
                        val2++;
                        p++;
                    }
                }

                Out_space += 2;
                In_space -= 2;
                System.out.println();
                row--;
            }
            sc.close();
        }
    }
}
//     }
// }
