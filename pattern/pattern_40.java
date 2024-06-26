/* 
                  * * * * * * * * * *
                * * * * * * * * * *
              * * * * * * * * * *
            * * * * * * * * * *
          * * * * * * * * * *
        * * * * * * * * * *
      * * * * * * * * * *
    * * * * * * * * * * 
  * * * * * * * * * *
* * * * * * * * * *

 */
package pattern;

import java.util.Scanner;

public class pattern_40 {
    // Define the static method pattern1 with one integer parameter
        public static void pattern(int n){
            // Generate a pattern of asterisks
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int k =1;k<=i;k++){
                    System.out.print("* ");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args){
            System.out.print("Enter number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            // Call the static method with an argument
            pattern(n); 
            // This will print a pattern of n rows of asterisks 
            sc.close();
        }  
}
