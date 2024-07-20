package OOPs;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator s = new Calculator();
        s.sum(9.3, 4.2);
        s.sum(4, 5);
        s.sum(3.5f,9.8f);
        s.sum(2, 7, 5);
    }
}
class Calculator {
    
    void sum(int a, int b) {
        System.out.println("sum : "+(a+b) );
    }
    void sum(int a, int b, int c) {
        System.out.println("sum : "+(a+b) );
    }
    void sum(float a, float b) {
        System.out.println("sum : "+(a+b) );
    }
    void sum(double a,double b) {
        System.out.println("sum : "+(a+b) );
    }
}