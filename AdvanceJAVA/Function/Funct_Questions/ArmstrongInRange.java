/* 
Print Armstrong Numbers
Take the following as input.


A number (N1)

A number (N2)

Write a function which prints all armstrong numbers between N1 and N2 (inclusive).


371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3


Example 1

Input

400
1000


Output

407


Explanation

Each number in output is in separate line.


Constraints

0 < N1 < 100
N1 < N2 < 10000
 */

package AdvanceJAVA.Function.Funct_Questions;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void CheckArmstrong(int n) {
        int cod = CountDigit(n);  //cod -> count of digit
        int sum = 0;
        int num = n;
        while (n > 0) {
            int remain = n%10;
            sum =(int)(sum + Math.pow(remain, cod));
            n /= 10;
            
        }
        // System.out.println(sum);
        if(num == sum) {
            System.out.println(num);
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
        int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i = n1 ; i <= n2; i++) {
        	CheckArmstrong(i);
			}
        sc.close();
    }
}
