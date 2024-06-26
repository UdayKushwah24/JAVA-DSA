package Recursion;

import java.util.Scanner;

public class sum {
    static void print_sum (int i ,int num ,int s){
        if(i == num){
            s += i;
            System.out.println("Sum : "+s);
            return ;
        }
        s += i;
       print_sum(i+1, num, s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number  : ");
        int num = sc.nextInt();
        print_sum(1,num,0);
        sc.close();
    }
}
