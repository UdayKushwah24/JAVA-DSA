package BitManipulation;

public class Get_ith_Bit {
    public static void getBit(int num,int ith_Bit) {
        if((num & (1<<ith_Bit)) != 0) System.out.println(ith_Bit+" bit is : "+1);
        else System.out.println(ith_Bit+" bit is : "+0);
    }
    public static void main(String[] args) {
        int num = 10;
        int ith_Bit = 1;
        getBit(num, ith_Bit);
    }
}
