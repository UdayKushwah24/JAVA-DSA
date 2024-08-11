/* 

*  *  *  *  *  *  *  *  *   
*  *  *  *     *  *  *  *  
*  *  *           *  *  *  
*  *                 *  *  
*                       *  
*  *                 *  *
*  *  *           *  *  *
*  *  *  *     *  *  *  *
*  *  *  *  *  *  *  *  *  

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("*  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
