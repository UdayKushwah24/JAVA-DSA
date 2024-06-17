/* 

 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *

 */
/* package pattern;
import java.util.Scanner;
public class pattern_12 {
    public static void pattern (int n){
        for(int i = 1; i<= 2*n+1;i++){
            if(i<n+1){
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= n-i+1; k++) {
                    System.out.print("* ");
                }
                

            }
            if(i>=n+1){
                for (int j = 1; j < 2*n-i+1; j++) {
                    System.out.print(" ");
                }
                for(int l=1; l<=i-n ; l++){
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
/* 
package pattern;
import java.util.Scanner;

public class pattern_12 {
    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n + 1; i++) {
            if (i <= n + 1) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= n - i + 1; k++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j < 2 * n + 2 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i - n - 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
} */

/* 
package pattern;
import java.util.Scanner;

public class pattern_12 {
    public static void pattern(int n) {
        // First part of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second part of the pattern
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Call the static method with an argument
        pattern(n);
        sc.close();
    }
}

 */



 package pattern;
import java.util.Scanner;

public class pattern_12 {
    public static void pattern(int n) {
        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
