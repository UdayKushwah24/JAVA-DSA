/* package AdvanceJAVA.SuperAssignment.Assignment_04;

import java.util.Scanner;

public class BostonNum {

    public static void Calc_BostonNum(int n) {
        int primeNum = 2;
        int i = 2;
        int num = n;
        while(i < Integer.MAX_VALUE) {
            if(Prime(i)) {
                primeNum = i;
            }
            i++;
        }

        int sum = 0;
        while(n > 0) {
            int remain = n / primeNum;
            n = remain;
            sum += primeNum;
        }

        if(SumDigits(num) == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }

    public static int SumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int remain = n % 10;
            sum += remain;
            n /= 10;
        }
        return sum;
    }

    public static boolean Prime(int n) {
        int count = 0;
        boolean isPrime = false;
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 0) {
            isPrime = true;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 378;
        Calc_BostonNum(n);
        
        sc.close();
    } 
}
 */


 package AdvanceJAVA.SuperAssignment.Assignment_04;

import java.util.Scanner;

public class BostonNum {

    // Function to calculate Boston Number
    public static void Calc_BostonNum(int n) {
        int originalNum = n;
        int sumOfPrimeFactorDigits = 0;

        // Prime factorization and summing their digits
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sumOfPrimeFactorDigits += SumDigits(i);
                n /= i;
            }
        }

        // Sum of digits of the original number
        int sumOfOriginalDigits = SumDigits(originalNum);

        // Checking if the sum of digits of original number and prime factors are equal
        if (sumOfOriginalDigits == sumOfPrimeFactorDigits) {
            System.out.println(1);  // It is a Boston number
        } else {
            System.out.println(0);  // It is not a Boston number
        }
    }

    // Function to calculate sum of digits of a number
    public static int SumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to check if a number is prime
    // public static boolean Prime(int n) {
    //     if (n < 2) return false;
    //     for (int i = 2; i * i <= n; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 22;  // Example input (you can change this value for testing)
        Calc_BostonNum(n);
        sc.close();
    }
}
