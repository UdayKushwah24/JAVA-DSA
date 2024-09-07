package AdvanceJAVA.NumberSystem;

public class practice_01 {
    public static void main(String[] args) {
        int n = 127;
        int sum = 0;
        int mul = 1;
        while(n > 0) {   
            int remainder = n%2;
            sum += remainder*mul;
            n /= 2;
            mul *= 10;
        }
        System.out.println(sum);
    }
}
