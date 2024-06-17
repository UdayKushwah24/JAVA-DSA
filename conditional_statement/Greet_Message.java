package conditional_statement;
import java.util.Scanner;
public class Greet_Message {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number from 0-3 => ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Good Morning");
        }
        else if(num == 1){
            System.out.println("Good Afternoon");
        }
        else if(num == 2){
            System.out.println("Good Evening");
        }
        else if(num == 3){
            System.out.println("Good Night");
        }
        else{
            System.out.println("Enter a valid number...0-3");
        }
        sc.close();
    }
}
