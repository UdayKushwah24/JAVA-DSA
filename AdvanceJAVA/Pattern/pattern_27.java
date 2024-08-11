/* 
                                       1  
                                    1  2  1  
                                 1  2  3  2  1  
                              1  2  3  4  3  2  1
                           1  2  3  4  5  4  3  2  1
                        1  2  3  4  5  6  5  4  3  2  1
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1)+"  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((i-j)+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
