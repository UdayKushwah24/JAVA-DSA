/* 
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
            0 1 0 1 0 1
            1 0 1 0 1 0 1
            0 1 0 1 0 1 0 1

 */
package pattern;

import java.util.Scanner;

public class pattern_22 {
    public static void pattern (int n) {
        // int number = 0;
        for(int i = 1;i <=n;i++){
            for(int j = 1; j<=i;j++){
                // number++ ;
                if((i+j) % 2 == 0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
                // number -= 1;
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
