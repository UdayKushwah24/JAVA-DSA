/* 
        
             1 
            2 2 
           3 3 3 
          4 4 4 4 
         5 5 5 5 5 
        6 6 6 6 6 6
        
 */
package pattern;

import java.util.Scanner;

public class pattern_41 {
     // Define the static method pattern1 with one integer parameter
        public static void pattern(int n){
            // Generate a pattern of asterisks
            for(int i=1; i<=n; i++) {
                //spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                //numbers
                for(int j=1; j<=i; j++) {
                    System.out.print(i+" ");
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
