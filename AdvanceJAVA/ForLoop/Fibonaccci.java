package AdvanceJAVA.ForLoop;

import java.util.Scanner;

public class Fibonaccci {
    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.print(a+" ");
    //     System.out.print(b+" ");
    //     for (int i = 2; i < 6; i++) {
    //         int c = a+b;
    //         System.out.print(c+" ");
    //         a = b;
    //         b = c;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 4;
        int star = 1;
        int row = 1;
        int a = 0;
        int b = 1;
        System.out.println(a+" ");
        System.out.print(b+" ");
        while(row <= n) {
            int i = 2;
            while(i<=star) {
                
                int c = a+b;
                System.out.print(c+" ");
                a = b;
                b = c;
            
                // System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            star++;

        }
        sc.close();
    }
}
