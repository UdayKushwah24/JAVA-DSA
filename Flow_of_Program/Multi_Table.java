/* 
Take a number as input and print the multiplication table for it.
 */
package Flow_of_Program;
import java.util.Scanner;
public class Multi_Table {
    
    public static void Table(int num) {
        
        for(int i=1 ; i<=10 ; i++){
            int z = i*num;
            System.out.println(num+" x "+i+" = "+z);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Table(num);
        sc.close();
    }
}
