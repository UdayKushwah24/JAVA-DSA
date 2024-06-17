package conditional_statement;
import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer => ");
        int num = sc.nextInt();
        if(num%5 == 0 || num%3 == 0){
                if(num%15 != 0){
                    System.out.println("Number is divisible by 5 or 3 but not divisible by 15");
                }
            }
        
        else{
            System.out.println("Number is not divisible by 5 or 3");
        }
        
        sc.close();
    }
}
