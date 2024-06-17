package conditional_statement;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage (0-100) => ");
        int num = sc.nextInt();
        if(num < 101 && num >=90){
            System.out.println("Excellent");
        }
        else if(num < 101 && num >=90){
            System.out.println("Good Afternoon");
        }
        else if(num < 90 && num >=80){
            System.out.println("Very Good");
        }
        else if(num < 80 && num >=70){
            System.out.println("Good");
        }
        else if(num < 70 && num >=60){
            System.out.println("Can do better");
        }
        else if(num < 60 && num >=50){
            System.out.println("Average");
        }
        else if(num < 50 && num >=40){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
