package Conditional_Loops;
import java.util.Scanner;
public class power{
    public static void Factorial(int base,int exponent){
        
        
    }
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        int base = sc.nextInt();
        Scanner soc = new Scanner(System.in);
        System.out.println("Enter exponent value");
        int exponent = soc.nextInt();
        // Call the static method with an argument
        Factorial (base,exponent);
        sc.close();
        soc.close();
    }
}
