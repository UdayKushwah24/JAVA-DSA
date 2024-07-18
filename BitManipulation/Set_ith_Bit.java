/* 
I/P : 10 = bin(1010) ,set bit by 2.
O/P : 14 = bin(1110)
 */
package BitManipulation;

public class Set_ith_Bit {
    public static void setBit(int num, int ith_Bit) {
        System.out.println(num | (1<<ith_Bit));
    }
    public static void main(String[] args) {
        int num = 10;
        int ith_Bit = 2;
        setBit(num, ith_Bit);
    }
}
