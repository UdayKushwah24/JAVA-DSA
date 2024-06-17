// Input a year and find whether it is a leap year or not.

package Flow_of_Program;
import java.util.Scanner;
public class Leap_year {
    public static void Check_Leap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } 
        else {
            System.out.println("Not a leap year");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Check_Leap(year);
        sc.close();
    }
}
