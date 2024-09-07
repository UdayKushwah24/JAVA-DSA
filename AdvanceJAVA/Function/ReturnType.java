package AdvanceJAVA.Function;

public class ReturnType {
    static int val = 100; // static variable heap mai bante hai
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 8;
        int b = 7;
        System.out.println(val);
        System.out.println(Add(a, b));
        System.out.println(val);
        System.out.println("Bye");
    }

    public static int Add(int a, int b) {
        int c = a+b;
        // int val = 90;
        val -= 5;
        // ReturnType.val = ReturnType.val - 5;
        return c + Sub(c,a);
    }

    public static int Sub(int a, int b) {
        return a-b;
    }
}
