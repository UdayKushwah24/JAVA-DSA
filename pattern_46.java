/* 
            
            A 
            B C 
            D E F 
            G H I J 
            K L M N O 
            P Q R S T U 
            
 */
package pattern;

import java.util.Scanner;

public class pattern_46 {
    public static void pattern(int n){
            // Generate a pattern of asterisks
            int number = 65;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print((char)(number)+" ");
                    number++;
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
