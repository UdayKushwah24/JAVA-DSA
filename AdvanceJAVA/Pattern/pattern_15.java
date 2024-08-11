/* 

*  *  *  *  *  
      *  *  *  *
            *  *  *
                  *  *
                        *  
                  *  *
            *  *  *
      *  *  *  *
*  *  *  *  *

 */
package Super150_Batch.Pattern;
import java.util.Scanner;
public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("      ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = n-2; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("      ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();

    }
}
