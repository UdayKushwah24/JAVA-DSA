/* package Functions;

public class practice {
    public static void bin_decimal(int num){
        int sum = 0;
        int pow = 0;
        while(num != 0) {
            int lastDigit = num%10;
            sum = sum + (int)(lastDigit*Math.pow(2, pow));
            num /= 10;
            pow++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num  = 010001;
        bin_decimal(num);
    }
}
 */

package Functions;

public class practice {
    public static void decimal_bin(int num) {
        int bin = 0;
        int poow = 0;
        while(num != 0){
            int ldigit = num%2;
            bin = bin + (int)(Math.pow(10,poow)*ldigit);
            poow++;
            num /= 2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        int num = 13; // Representing binary number as a string
        decimal_bin(num);
    }
}
