package Conditional_Loops;
import java.util.Scanner;
public class Distance {
    public static void Calculate (int x1,int y1,int x2,int y2){
        double s = Math.sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.println("Distance is : "+s);
    }
    public static void main(String[] args) {
        System.out.print("Enter x1 : ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.print("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        // Scanner sc = new Scanner(System.in);
        int x2 = sc.nextInt();
        System.out.print("Enter y2 : ");
        int y2 = sc.nextInt();
        // Call the static method with an argument
        Calculate(x1,y1,x2,y2);
        sc.close();
    }
}


 