package Array;
import java.util.Scanner;
public class Input_Array {
    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Maths marks : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Chemistry marks : ");
        marks[2] = sc.nextInt();
        System.out.println("Phy = "+marks[0]);
        System.out.println("Maths = "+marks[1]);
        System.out.println("Chem = "+marks[1]);

        //Update array
        marks[1] = 100;
        System.out.println("After update maths marks = "+marks[1]);
        sc.close();
    }
}
