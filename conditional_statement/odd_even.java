package conditional_statement;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number => ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is a Even Number");
        }
        else{
            System.out.println(num+" is a Odd Number");
        }
        sc.close();
    }
}
