package OOPs.Inheritance;

 
public class MethodsOverloading {
    // Method Overloading
    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(add(2, 5, 4));
        System.out.println(add(2, 5, 4.0));
        // System.out.println(add(2, 5, 4, 4 , 6, 8 ,9 , 8));
        // System.out.println(add(2, 5, 4, 4 , 6, 8 ,9 , 8));
    }
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
    public static int add(int a, int b, double c) {
        return (int)(a+b+c);
    }

    // variable no. of argument ya triple dot
    public static int add(int...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    // public static int add(int...a, int x) {  // this is wrong method....
    public static int add(int x,int...a) {
        int sum = x;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
