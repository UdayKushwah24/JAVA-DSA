package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class CheckAnagram {
    
    public static boolean checkArmstrong(int n) {
        boolean isAnagram = false;
        int digits = CountDigits(n);
        int sum = 0;
        int num = n;
        while(n > 0) {
            int last_digit = n % 10;
            sum += Math.pow(last_digit,digits);
            n /= 10;
        }
        if(num == sum) isAnagram = true;

        return isAnagram;
    }

    public static int CountDigits(int n) {
        int count = 0;
        while(n > 0) {
            int last_digit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        boolean ans = checkArmstrong(n1);
        System.out.println(ans);
        sc.close();
    }
}