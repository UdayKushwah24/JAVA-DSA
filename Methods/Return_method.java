package Methods;
import java.util.Scanner;
public class Return_method {
    static float sum (int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();
        System.out.print(sum(x,y));
        sc.close();
    }
}
