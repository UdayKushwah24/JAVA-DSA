/* 
            *
            **
            ***
            ****
            *****
 */
package AdvanceJAVA.SuperAssignment.Assignment_02;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int star = 1;
        int row = 1;
        while(row <= num) {
            int i =1;
            while(i <= star) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
            star++;
        }
        sc.close();
    }
}
