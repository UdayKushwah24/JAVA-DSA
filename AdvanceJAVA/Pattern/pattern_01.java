/* 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_01 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();

        // System.out.println("===========================================================================");

        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
    }
}
