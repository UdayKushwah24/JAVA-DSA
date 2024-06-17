package Conditional_Loops;
import java.util.Scanner;
public class factorial {
    public static void Factorial(int n){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.println("Factorial of "+n+" = "+s);
    }
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the static method with an argument
        Factorial (n);
        sc.close();
    }
}
