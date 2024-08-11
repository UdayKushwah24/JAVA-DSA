/* 
* * * * *
* * * *
* * *
* *
*

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while ( i < n) {
            int j = n-i;
            while ( j>0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }
        sc.close();

        // System.out.println("======================================================");

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = n-i; j>0; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
    }
}
