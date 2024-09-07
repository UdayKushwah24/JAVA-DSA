package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class CheckPrime {
    public static void Check_Prime(int n) {
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Check_Prime(n);
        sc.close();
    }
}