/* 
            0
            1       1
            2       3       5
            8       13      21      34
            55      89      144     233     377

 */
package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n == 1) {
            System.out.println(0+"\t");
            return;
        }
        else {
            int a = 1;
            int b = 1;
            System.out.println(0+"\t");
            System.out.println(1+"\t"+1+"\t");
            // int n = 4;
            int star = 3;
            int row = 1;
            while(row < (n-1)) {
                int i = 1;
                while(i <= star) {
                    int c = a+b;
                    System.out.print(c+"\t");
                    a = b;
                    b = c;
                    i++;
                }
                System.out.println();
                row++;
                star++;
            }
        }
    }

}
