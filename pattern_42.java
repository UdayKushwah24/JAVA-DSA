/*
Floyd's Triangle
            a
            a b
            a b c
            a b c d
            a b c d e

*/

package pattern;

import java.util.Scanner;

public class pattern_42 {
        public static void pattern (int n) {
        
        for(int i = 1;i <=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print((char)(96+j)+" ");
         
            }
            System.out.println();
        }
        // for(char i = 'a';i <='e';i++){
        //     for(char j = 'a'; j<=i;j++){
        //         System.out.print(j+" ");
               
        //     }
        //     System.out.println();
        // }
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
