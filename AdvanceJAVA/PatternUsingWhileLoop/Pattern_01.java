/* 
                            *  *  *  *  *
                            *  *  *  *  *
                            *  *  *  *  *
                            *  *  *  *  *
                            *  *  *  *  *
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
       
        int row = 1;
        while(row <= n){
            int i = 1;
            while(i <= n) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
