package Recursion;

import java.util.Scanner;

public class stack_height_n_ {
    public static int calcPower(int x , int n) {
        if(n == 0){  //base case 1
            return 1;
        }
        if(x == 0){ //base case 2
            return 0;
        }
        return x*calcPower(x, n-1);
    }    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(calcPower(x, n));
        sc.close();
    }
}
