package conditional_statement;
import java.util.Scanner;
public class Positive_integer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer => ");
        int num = sc.nextInt();
        if(num>0){
            if(num%5 == 0){
                System.out.println(num + " is divisible by 5.");
            }
            else{
                System.out.println(num + " is not divisible by 5.");
            }
        }
        else{
            System.out.println("Number is negative");
        }
        
        sc.close();
    }
}
