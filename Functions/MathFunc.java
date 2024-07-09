/* 
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )
 */
package Functions;

public class MathFunc {
    public static void MathFunction(int num1,int num2){
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.pow(num1, num2));
        // System.out.println(Math.average(num1, num2));
        System.out.println(Math.abs(num1-num2));
          
    }
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        MathFunction(num1,num2);
    }
}
