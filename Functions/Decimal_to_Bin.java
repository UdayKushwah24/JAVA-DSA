package Functions;

public class Decimal_to_Bin {
    public static void decimalToBin(int decimalValue){
        int value = decimalValue;
        int power = 0;
        int binNum = 0;
        while (decimalValue>0) {
            int remainder = decimalValue % 2;
            binNum = binNum + (remainder*(int)Math.pow(10,power));
            power++;
            decimalValue /= 2;
        }
        System.out.println("Decimal("+value+") "+" to binary is "+binNum);
    }
    public static void main(String[] args) {
        decimalToBin(127);
    }
}
