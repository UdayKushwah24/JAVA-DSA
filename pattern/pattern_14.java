/* 

     *********
      *     *
       *   *
        * *
         * 


 */

 package pattern;
 import java.util.Scanner;
 public class pattern_14 {
     public static void pattern(int n){
         for (int i = 0; i <= n; i++) {
             for (int j = 0; j <= 2*n; j++) {
                 if(i==0 || i==j||i+j==2*n){
                     System.out.print("*");
                 }
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
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
 