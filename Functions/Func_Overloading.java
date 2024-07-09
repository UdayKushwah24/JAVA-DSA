package Functions;

import java.util.Scanner;

public class Func_Overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2 Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3 Number : ");
        int num3 = sc.nextInt();
        System.out.println(sum(num1,num2,num3));
        sc.close();
    }
}
