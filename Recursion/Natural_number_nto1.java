package Recursion;
import java.util.Scanner;
public class Natural_number_nto1 {
   static void PrintDecreasing (int num) {
        // base case or halting case
        if(num == 1){
            System.out.println(1);
            return;
        }
        // self work
        System.out.println(num);
        // Recursive work
        PrintDecreasing(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int num = sc.nextInt();
        PrintDecreasing(num);
        // System.out.println("k");
        sc.close();
    }
} 

