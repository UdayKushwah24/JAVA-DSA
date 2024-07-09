/* 

* * * * * * * * *
*               *
*               *
*               *
*               *
* * * * * * * * *


 */

package pattern;

import java.util.Scanner;
public class pattern_37 {
        // Define the static method pattern1 with one integer parameter
        public static void pattern(int n,int m){
            // Generate a pattern of asterisks
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(i==1 || j==1 || i==n ||j ==m)
                    System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args){
            System.out.print("Enter row number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print("Enter column number : ");
            // Call the static method with an argument
            int m = sc.nextInt();
            pattern(n,m); 
            // This will print a pattern of n rows of asterisks 
            sc.close();
        }    
    }