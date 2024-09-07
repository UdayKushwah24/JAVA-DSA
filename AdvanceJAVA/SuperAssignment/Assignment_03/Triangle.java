/* 
            *
            **
            ***
            ****
            *****
 */
package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class Triangle {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= 1;
        }
        return fact ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 5;
        int star = 1;
        int row = 1;
        int fact = 1;
        while(row <= num) {
            int i =1;
            while(i <= star) {
                fact = (factorial(row)/((factorial(row-i))*factorial(i)));
                System.out.print(fact + " ");
                i++;
            }
           
            System.out.println();
            row++;
            star++;
        }
        sc.close();
    }
}
