package Basic;
import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        String num = sc.nextLine();
        System.out.println("The length of number is "+num.length());
        sc.close();
    }
}
