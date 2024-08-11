/* 
               1
            1  1  1
         1  1  1  1  1
      1  1  1  1  1  1  1
   1  1  1  1  1  1  1  1  1
   
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j>0; j--) {
                System.out.print("   ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("1  ");
                
            }
          
            for (int j = 0; j < i; j++) {
                System.out.print("1  ");
            }
             System.out.println();
        }
        sc.close();
    }
}
