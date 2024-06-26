package Recursion;

import java.util.Scanner;

public class print_natral_n {
    public static void numbr(int n){
        if (n == 11) {
            // System.out.println(1);
            return;
        }
        System.out.println(n);
        numbr(n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        numbr(n);
        sc.close();
    }
}
