/* 
                              0
                            9 0 9
                          8 9 0 9 8
                        7 8 9 0 9 8 7 
                      6 7 8 9 0 9 8 7 6
                    5 6 7 8 9 0 9 8 7 6 5
                  4 5 6 7 8 9 0 9 8 7 6 5 4
                3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
              2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
            1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
 */
package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
          System.out.print("  ");
        }
        System.out.println("0");
        // int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                
                // if(i == n) System.out.print("0 ");
                 System.out.print((n-j)+" ");
            }
            System.out.print("0 ");
            for (int j = 0; j <= i ; j++) {
                System.out.print((n-j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}