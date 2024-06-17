/* Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
 */
/* 
package Functions;
import java.util.Scanner;
public class MaxMinFinder {
    public static void Greater(int x1,int x2,int x3){
        if(x1>x2){
            if(x1>x3) System.out.println("Max : "+x1);
            else System.out.println("Max : "+x3);
        }
        else{
            if(x2>x3) System.out.println("Max : "+x2);
            else System.out.println(x3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter x3 : ");
        int x3 = sc.nextInt();
        Greater(x1,x2,x3);
        sc.close();
    }
}
 */
package Functions;
import java.util.Scanner;

public class MaxMinFinder {

    // Method to print the maximum number among three numbers
    public static void printMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The maximum number is: " + max);
    }

    // Method to print the minimum number among three numbers
    public static void printMin(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The minimum number is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Call methods to print the maximum and minimum numbers
        printMax(num1, num2, num3);
        printMin(num1, num2, num3);
        
        sc.close();
    }
}

