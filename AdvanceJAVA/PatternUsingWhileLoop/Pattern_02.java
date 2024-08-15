/* 
                *  
                *  *  
                *  *  *  
                *  *  *  *  
                *  *  *  *  *
 */
package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        while(row <= n){
            int i = 1;
            while(i <= star) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
            star++;
        }
        sc.close();
    }
}
