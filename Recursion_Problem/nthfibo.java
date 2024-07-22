package Recursion_Problem;

public class nthfibo {
    public static int fibo(int n) {
        if(n==1 || n==0) return n;
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        // int n = 5;
        System.out.println(fibo(0 ));
    }
}
