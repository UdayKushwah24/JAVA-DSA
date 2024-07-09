/* 

            1           1
              2       2
                3   3
                  4
                5   5
              6       6
            7           7
 */
package pattern;

import java.util.Scanner;

public class pattern_47 {
    public static void pattern(int n){
            // Generate a pattern of asterisks
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==j || i+j==n+1) System.out.print(i+" ");
                    else System.out.print("  ");
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
