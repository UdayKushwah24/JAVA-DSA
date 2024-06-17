package Basic;
import java.util.Scanner;
public class greet_message {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name ;
        name = sc.nextLine();
        System.out.println("Welcome..... "+name);
        sc.close();
    }
}