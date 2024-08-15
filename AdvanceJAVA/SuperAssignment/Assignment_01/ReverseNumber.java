package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int reverseNum = 0;
        while(n > 0) {
            int remainder = n % 10;
            reverseNum = remainder + (reverseNum * (int)Math.pow(10, 1));
            n /= 10;
        }
        System.out.println(reverseNum);
        sc.close();
    }
}
