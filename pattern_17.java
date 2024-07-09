/* 

17.      1
        212
       32123
      4321234
       32123
        212
         1

*/
package pattern;

import java.util.Scanner;

public class pattern_17 {
    
        public static void pattern(int n){
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(" ");
                }
                for(int k=i;k>=1;k--){
                    System.out.print(k);                    
                }
                for(int k=1;k<=i-1;k++){
                    System.out.print(k+1);                    
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(" ");
                }
                for(int k=i;k>=1;k--){
                    System.out.print(k);                    
                }
                for(int k=2;k<=i;k++){
                    System.out.print(k);                    
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
