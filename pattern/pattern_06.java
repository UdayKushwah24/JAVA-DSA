/* 
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */


package pattern;
import java.util.Scanner;
public class pattern_06 {
    public static void pattern (int n) {
        for (int i = 1; i <= 2*n+1; i++) {
            if(i < n+1){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // System.out.println();
            }
            if(i >= n+1){
                for (int k = 1; k <2*n-i+1; k++) {
                    System.out.print("*");
                }
                // System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the static method with an argument
        pattern(n); 
        // This will print a pattern of n rows of asterisks 
        sc.close();
    }
}


/* package pattern;
import java.util.Scanner;

public class pattern_06 {
    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i <= n + 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= 2 * n + 1 - i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the static method with an argument
        pattern(n);
        // This will print a pattern of n rows of asterisks 
        sc.close();
    }
} */


