// Input a year and find whether it is a leap year or not.

package Flow_of_Program;
import java.util.Scanner;
public class Sum_two_number {
    public static void Sum (int  num1, int num2) {
        int z = num1 + num2;
        System.out.println("Sum : " + z);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        Sum (num1,num2);
        sc.close();
    }
}
