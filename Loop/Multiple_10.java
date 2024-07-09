/* Keep entering number till user enters a multiple of 10 */
package Loop;
import java.util.Scanner;
public class Multiple_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        } while(true);
        sc.close();        
    }
}
