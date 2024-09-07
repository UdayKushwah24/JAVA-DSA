package AdvanceJAVA.NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num = 1111111;
        int sum = 0;
        int mul = 1;
        while(num > 0) {
            int remainder = num%10;
            sum += remainder*mul;
            num /= 10;
            mul *= 2;
        }
        System.out.println(sum);
    }
}
