package conditional_statement;
import java.util.Scanner;
public class Absolute_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer => ");
        int num = sc.nextInt();
        if(num<0){
           
                System.out.println("Absolute value is => "+num*-1);
            }
        
        else{
            System.out.println("Absolute value is => "+num);
        }
        
        sc.close();
    }
}
