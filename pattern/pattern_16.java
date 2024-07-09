/* 
  
  .           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1


 */

package pattern;

import java.util.Scanner;

public class pattern_16{
    public static void pattern (int n) {
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=2*n-1;j++){
                if(i+j == 6){
                System.out.print("1 ");
                }
                else if(j-i == 4){
                    System.out.print("1 ");
                }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
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
