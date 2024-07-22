package Recursion_Problem;

public class PrintDecreasingOrd {
    public static void PrintNum(int num) {
        if(num == 1) {
            System.out.println(1);
            return;
        }
        // System.out.print(num+" ");
        PrintNum(num - 1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int num = 6;
        PrintNum(num);
        
    }
}
