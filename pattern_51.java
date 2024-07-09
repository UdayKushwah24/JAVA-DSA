/* 
            
            1
            2 7
            3 8 12
            4 9 13 16
            5 10 14 17 19
            6 11 15 18 20 21

 */
package pattern;

import java.util.Scanner;

public class pattern_51 {
    public static void pattern (int n) {
        for(int i = 1;i <=n;i++){
            int a = i;
            for(int j = 1; j<=i;j++){
                System.out.print(a+" ");
                a = a+n-j;
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
