package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class BinToDecimal {
    public static void Bin_Decimal(int n) {
        
        int decimal = 0;
        int count = 0;
        while(n > 0) {
            int last_digit = n % 10;
            decimal += last_digit*Math.pow(2,count);
            count++;
            n /= 10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bin_Decimal(n);
        sc.close();
    }
}