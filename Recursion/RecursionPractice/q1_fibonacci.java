package Recursion.RecursionPractice;

public class q1_fibonacci {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(PrintFibonacci(i) + " ");
        }
    }

    public static int PrintFibonacci(int n) {
        if (n == 0 || n == 1) {
            // System.out.println(n);
            return n;
        }

        int fnm1 = PrintFibonacci(n - 1);
        int fnm2 = PrintFibonacci(n - 2);

        return fnm1 + fnm2;
    }
}
