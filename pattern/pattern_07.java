/* 
     *****
      ****
       ***
        **
         *
 */
package pattern;
import java.util.Scanner;
public class pattern_07 {
    public static void pattern (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
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
