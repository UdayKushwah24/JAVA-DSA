/* 
              5  4  3  2  *  
              5  4  3  *  1
              5  4  *  2  1
              5  *  3  2  1
              *  4  3  2  1
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j)==n-1) System.out.print("*  ");
                else System.out.print(n-j+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
