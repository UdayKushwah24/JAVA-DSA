package AdvanceJAVA.NumberSystem;

import java.util.Scanner;

public class FromXToYBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the number to be converted : ");
        int sourceBase = sc.nextInt();

        System.out.print("Enter the number :");
        int num = sc.nextInt();

        System.out.print("Enter the base of the destination number system : ");
        int destBase = sc.nextInt();

        
        int sum = 0;
        int mul = 1;
        while(num > 0) {
            int remainder = num%destBase;
            sum += remainder*mul;
            num /= destBase;
            mul *= sourceBase;
        }
        System.out.println(sum);

        sc.close();
    }
}
