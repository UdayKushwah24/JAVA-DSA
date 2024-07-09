/* Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
 */
package Functions;

import java.util.Scanner;

public class Even {
    public static boolean isEven(int num) {
        if(num %2 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number => ");
        int num = sc.nextInt();
        if(isEven(num)) System.out.print("Even Number");
        else System.out.println("Odd Number");
        sc.close();
    }
}
