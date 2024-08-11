/* 
               *
            *  *  *
         *  *  *  *  *
      *  *  *  *  *  *  *
   *  *  *  *  *  *  *  *  *

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = x-i; j > 0; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
       
        sc.close();
    }
}
