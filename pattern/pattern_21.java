/*
Floyd's Triangle
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15

*/

package pattern;

import java.util.Scanner;

public class pattern_21 {
        public static void pattern (int n) {
        int number = 1;
        for(int i = 1;i <=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(number+" ");
                number++;
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
