package conditional_statement;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        //for(int i =2;i<=(num-1);i++){       // Time complexity == n-2
        for(int i =2;i<=Math.sqrt(num);i++){       // Time complexity == sqrt(n)
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println(num+" is a prime number.");
        } else {
            System.out.println(num+" is not a prime number.");
        }
        sc.close();
    }
}
