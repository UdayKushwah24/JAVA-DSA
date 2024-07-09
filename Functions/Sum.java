package Functions;

import java.util.Scanner;

public class Sum {
    public static int printSum(int num1,int num2){
        System.out.print("Sum is : ");
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int ans = printSum(num1,num2);
        System.out.println(ans);
        sc.close();
    }
}
