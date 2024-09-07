package AdvanceJAVA.Function;

public class Method {
    public static void Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print("Factorial of "+num+"! = ");
        System.out.print(fact);
    }
    public static void main(String[] args) {
        Factorial(3);
    }
}
