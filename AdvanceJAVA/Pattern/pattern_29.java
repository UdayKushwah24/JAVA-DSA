/* 
                       1
                    2  0  2
                 3  0  0  0  3
              4  0  0  0  0  0  4
           5  0  0  0  0  0  0  0  5  
        6  0  0  0  0  0  0  0  0  0  6

 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                if(j==0) System.out.print((i+1)+"  ");
                else System.out.print("0  ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==i) System.out.print((i+1)+"  ");
                else System.out.print("0  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
