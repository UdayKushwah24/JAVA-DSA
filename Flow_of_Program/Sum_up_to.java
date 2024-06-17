package Flow_of_Program;
import java.util.Scanner;
public class Sum_up_to {
    public static void sum(int num) {
        int s = 0;
        for(int i=1 ; i<=num ; i++){
            s = s + i;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sum (num);
        sc.close();
    }
}
