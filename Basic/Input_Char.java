package Basic;
import java.util.Scanner;
public class Input_Char {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        char num = sc.next().charAt(3);
        System.out.print(num);
        sc.close();
    }
}



/* 
 package Basic;
import java.util.Scanner;
public class Input_Char {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        String num = sc.next();
        System.out.println(num);
        Scanner soc = new Scanner(System.in);
        System.out.print("Enter x : ");
        String b = soc.nextLine();
        System.out.print(b);
        sc.close();
        soc.close();
    }
}
 */