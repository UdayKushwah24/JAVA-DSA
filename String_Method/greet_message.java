package String;
import java.util.Scanner;
public class greet_message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>",name);
        System.out.println(letter);
        sc.close();
    }
}
