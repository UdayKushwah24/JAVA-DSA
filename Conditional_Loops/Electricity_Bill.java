package Conditional_Loops;
import java.util.Scanner;
public class Electricity_Bill {
    public static void Calculate (double unit ,double hour){
        if(unit >= 10){
            double price = hour*800;
            System.out.println("Total bill is "+price);
        }
        else if(unit<10 & unit>=6){
            double price = hour*600;
            System.out.println("Total bill is "+price);
        }
        else if(unit<6 & unit>=3){
            double price = hour*500;
            System.out.println("Total bill is "+price);
        }
        else{
            double price = hour*300;
            System.out.println("Total bill is "+price);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter unit : ");
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextFloat();
        System.out.print("Enter hour : ");
        double hour = sc.nextFloat();
        // Call the static method with an argument
        Calculate(unit,hour);
        sc.close();
    }
}


 