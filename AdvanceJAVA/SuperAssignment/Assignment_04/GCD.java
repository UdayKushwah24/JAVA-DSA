package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class GCD {
    public static void findHCF(int a, int b) {
        int hcf = Integer.MIN_VALUE;
        for(int i = 1; i <= Math.min(a,b); i++) {
            if((a%i==0) && (b%i==0)) {
                hcf = Math.max(i,hcf);
            }
        }
        System.out.println(hcf);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        findHCF(a,b);
        sc.close();
    }
}