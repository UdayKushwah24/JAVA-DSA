package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5;
        int star = 1;
        int row = 0;
        while(row < n) {
            //star
            int i = 0;
            int ncr = 1;
            while(i < star) {
                System.out.printf("%2d",ncr);
                System.out.print(" ");
                ncr =((row-i)*ncr)/(i+1);
                i++;
            }
            //next row preparation
            System.out.println();
            row++;
            star++;
        }
        sc.close();
    }
}
