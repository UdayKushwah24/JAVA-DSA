/* 
Here are some examples of Armstrong numbers for different digit lengths:

3-Digit Armstrong Numbers:
153: (1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)
370: (3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370)
371: (3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371)
407: (4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407)

4-Digit Armstrong Numbers:
1634: (1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634)
8208: (8^4 + 2^4 + 0^4 + 8^4 = 4096 + 16 + 0 + 4096 = 8208)
9474: (9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474)

5-Digit Armstrong Number:
54748 : (5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748)

6-Digit Armstrong Number:
548834 : (5^6 + 4^6 + 8^6 + 8^6 + 3^6 + 4^6 = 15625 + 4096 + 262144 + 262144 + 729 + 4096 = 548834)

These examples show how the Armstrong number property holds for different numbers of digits.
*/

 package AdvanceJAVA.Function.Funct_Questions;

 import java.util.Scanner;
 
 public class Armstrong_01 {
     public static boolean CheckArmstrong(int n) {
         int cod = CountDigit(n);                //cod -> count of digit
         int sum = 0;
         int num = n;
         
         while (n > 0) {
             int remain = n%10;
             sum =(int)(sum + Math.pow(remain, cod));
             n /= 10;
             
         }
         
         if(num == sum) {
            return true;
         } else {
            return false;
         }
 
     }
 
     public static int CountDigit(int n) {
         int count = 0;
         while(n > 0) {
             count++;
             n /= 10;
         }
         return count;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println(CheckArmstrong(n));
         sc.close();
     }
 }
 
