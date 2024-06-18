/* 
What will be the value of the following expression 
int y = 7
int x = ++y + 8
value of x??
 */

package BitWise_Operator;

public class Practice_01 {
    public static void main(String[] args) {
        int y = 7 ;
        int x = ++y + 8 ;
        System.out.println(x);

        System.out.println("********");

        char a = 'B';
        // System.out.println(a++);   //B
        System.out.println(++a);   //C
    }
}
