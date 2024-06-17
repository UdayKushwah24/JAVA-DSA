package Recursion;
import java.util.Scanner;
public class Natural_Number {
    static void PrintIncreasing (int num) {
        // base case
        if(num == 1){
            System.out.println(1);
            return;
        }
        // recursive case 
        PrintIncreasing(num - 1);
        // self work
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int num = sc.nextInt();
        PrintIncreasing(num);
        // System.out.println("k");
        sc.close();
    }
}