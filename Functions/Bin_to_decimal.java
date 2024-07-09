/* package Functions;

public class Bin_to_decimal {
    public static void binToDecimal(int n){
        int binNum = n;
        int pow = 0;
        int decimalValue = 0;
        while (n>0) {
            int lstDigit = n % 10;
            decimalValue = decimalValue + (lstDigit * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal number of "+binNum+" = "+decimalValue);
    }
    public static void main(String[] args) {
        binToDecimal(0100010001);    //input : 010001   o/p: Decimal number of 4097 = 57
    }
}

 */


// The code you've written is for converting a binary number (given as an integer) to its decimal equivalent. However, there are a couple of issues:
// In Java, integers starting with 0 are treated as octal (base 8) numbers, which is not what you want for a binary number.
// The binary number should be passed as a string to avoid the issue with leading zeros.
// Here is the corrected version of the code:

package Functions;
public class Bin_to_decimal {
    public static void bin_decimal(String num) {
        int sum = 0;
        int pow = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            int lastDigit = num.charAt(i) - '0';  //convert string to int
            sum = sum + lastDigit * (int)Math.pow(2, pow);
            pow++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String num = "010001"; // Representing binary number as a string
        bin_decimal(num);
    }
}

/* Explanation:
The bin_decimal method now takes a String as input, which allows us to handle binary numbers with leading zeros correctly.
The binary number is processed from the least significant bit (rightmost) to the most significant bit (leftmost).
The charAt(i) - '0' converts the character at position i to its corresponding integer value.
In main, the binary number is passed as a string to preserve its format.
This will correctly convert the binary string "010001" to its decimal equivalent. */