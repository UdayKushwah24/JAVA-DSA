//Guess the output and analyse the call stack

package AdvanceJAVA.Function;

public class Ques_01 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Add();
        System.out.println("Bye");
    }

    public static void Add() {
        int a = 8;
        int b = 7;
        int c = a+b;
        Sub();
        System.out.println(c);
    }

    public static void Sub() {
        int a = 8;
        int b = 7;
        int c = a-b;
        System.out.println(c);
    }
}
