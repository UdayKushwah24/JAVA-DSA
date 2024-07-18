package BitManipulation;

public class Update_ith_Bit {
    public static int setBit(int num, int ith_Bit) {
        int bitmask = 1<<ith_Bit;
        return num|bitmask;
    }
    public static int clearBit(int num, int ith_Bit) {
        int bitmask = ~(1<<ith_Bit);
        return num & bitmask;
    }
    public static int  updateBit(int num , int ith_Bit, int newbit) {
        // if(newbit == 0) {
        //     System.out.println(clearBit(num, ith_Bit));
        // } else {
        //     System.out.println(setBit(num, ith_Bit));
        // }

        num = clearBit(num, ith_Bit);
        int bitmask = newbit << ith_Bit;
        return num | bitmask ;
    }
    public static void main(String args[]) {
        int num = 10;
        int ith_bit = 1;
        System.out.println((updateBit(num, ith_bit, 1)));
    }
}
