/* 
Convert decimal no. to binary no.
I/P : 38
O/P : 100110
 */
package AdvanceJAVA.NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 300;
        int sum = 0;
        int mul = 1;
        while(num > 0) {
            int remainder = num % 2;
            sum += remainder*mul;
            num /= 2;
            mul *= 10;

        }

        System.out.println(sum);
    }
}
