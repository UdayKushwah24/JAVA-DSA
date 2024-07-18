package BitManipulation;

public class OddEven {
    public static void isOddEven(int num) {
        int bitmask = 1;
        if((num & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number.");
        }
    }
    public static void main(String[] args) {
        int num = 8;
        isOddEven(num);
    }
}
