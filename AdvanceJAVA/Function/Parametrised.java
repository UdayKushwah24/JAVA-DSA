package AdvanceJAVA.Function;

public class Parametrised {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 2;
        int b = 5;
        Add(a,b);
        System.out.println("Bye");
    }

    public static void Add(int p,int q) {
        int r = p+q;
        System.out.println(r);
    }
}
