/* 

F 
F E 
F E D 
F E D C 
F E D C B 
F E D C B A

 */
package pattern;

import java.util.Scanner;

public class pattern_44 {
     // Define the static method pattern1 with one integer parameter
        public static void pattern(int n){
            // Generate a pattern of asterisks
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((char)(65+n-j)+" ");
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
