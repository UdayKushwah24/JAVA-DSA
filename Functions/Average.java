/* 
Write a Java method to compute the average of three numbers..
 */
package Functions;

import java.util.Scanner;

public class Average {
    public static float calcAverage(int a,int b,int c){
        float avg  = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = sc.nextInt();
        System.out.print("Input the second number: ");
        int y = sc.nextInt();
        System.out.print("Input the third number: ");
        int z = sc.nextInt();
        System.out.print("The average value is " + calcAverage(x, y, z)+"\n" );
        sc.close();
    }
}
