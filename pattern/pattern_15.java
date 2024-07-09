/* 

         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */

 package pattern;
 import java.util.Scanner;
 public class pattern_15 {
     public static void pattern(int n){
        if(n%2==0){
         for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= n; j++) {
                 if(i+j==n/2 || j == n/2+i || i==n/2+j || i-n==n/2-j){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        }
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i+j==n/2 || j == n/2+i || i==n/2+j || i-n==n/2-j-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
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
 