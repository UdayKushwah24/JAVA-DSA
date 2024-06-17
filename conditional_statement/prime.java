package conditional_statement;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 2;i<=num;i++){
            if(num%i==0){
                count = count + 1;
            }
        }
        if(count == 1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("not a prime number");
        }
        sc.close();
    }
}
