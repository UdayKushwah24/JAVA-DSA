package Recursion_Problem;

public class Fibonacci {
    public static int fibo(int n) {
        if(n==1 || n==0) return n;
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0;i<n;i++)
        System.out.print(fibo(i )+" ");
    }
}
