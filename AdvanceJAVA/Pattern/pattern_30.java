/* 
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
            5  4  3  2  1
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n-j+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
