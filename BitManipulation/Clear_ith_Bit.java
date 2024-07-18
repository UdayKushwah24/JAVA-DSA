/* 
Input : 10 = bin(1010) , ith_bit = 1(bit to be cleared)
Output: 8 = bin(100)
Logic : 1 -> 0
        0 -> 0
 */
package BitManipulation;

public class Clear_ith_Bit {
    public static void clearBit(int num,int ith_Bit) {
        int bitmask = ~(1<<ith_Bit);
        System.out.println(num & bitmask);
    }
    public static void main(String[] args) {
        int num = 10;
        int ith_Bit = 1;
        clearBit(num, ith_Bit);
    }
}
