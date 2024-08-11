/* 

Prints a diamond pattern of asterisks (*) with a given size.

The pattern is symmetric about the center of the diamond, and the size of the diamond is always odd.
If the input size is even, it is incremented by 1 to make it odd.

Example:
Input: 8
Output:
        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        if(n%2 == 0) n = n+1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                if((i+j) == n/2 || (j-i) == n/2 || (i-j) == n/2 || i-n==n/2-j-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
