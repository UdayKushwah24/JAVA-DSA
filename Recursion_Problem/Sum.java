package Recursion_Problem;

public class Sum {

    public static int PrintSum(int num) {
        //Base Case
        if(num == 1) return 1;
        return num+PrintSum(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(PrintSum(num));
    }
}
