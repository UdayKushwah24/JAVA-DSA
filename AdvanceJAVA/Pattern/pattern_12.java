/* 
                  *
               *  !  *
            *  !  *  !  *
         *  !  *  !  *  !  *
      *  !  *  !  *  !  *  !  *
   *  !  *  !  *  !  *  !  *  !  *

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j>0; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j < i+1; j++) {
                if((j%2 == 0))
                System.out.print("*  ");
                else {
                    System.out.print("!  ");
                }
            }
          
            for (int j = 0; j < i; j++) {
                if((i+j)%2 == 0)
                System.out.print("!  ");
                else {
                    System.out.print("*  ");
                }
            }
             System.out.println();
        }
        sc.close();
    }
}
