/* 
Take the following as input.

Minimum Fahrenheit value
Maximum Fahrenheit value
Step

Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
0 -17
20 -6
40 4
60 15
80 26
100 37

Input Format
The first line of the input contains an integer denoting the Minimum Fahrenheit value. The second line of the input contains an integer denoting the Maximum Fahrenheit value. The third line of the input contains an integer denoting the Step.

Constraints
0 < Min < 100
Min < Max < 500
0 < Step<150

Output Format
Print Fahrenheit and Celsius values separated by a tab. Each step should be printed in a new line.

Sample Input
0 
100 
20
Sample Output
0 -17 
20 -6 
40 4 
60 15 
80 26 
100 37
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;

import java.util.Scanner;

public class CelciusToFahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int min = sc.nextInt();
        // int max = sc.nextInt();
        // int step = sc.nextInt();
        int min = 0;
        int max = 100;
        int step = 20;
        // int n =(min+max)/step+1;
        // System.out.println(5/9+1);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(min);
        //     double literal = 0.55555555555555555555555555555556;
        //     if(min <= max) {
        //       int C =(int)((literal)*(min-32)); 
        //       System.out.print("\t"+C);
        //     }
        //     System.out.println();
        //     min += step;
        // }

        for (int Fahrenheit = min; Fahrenheit <= max; Fahrenheit += step) {
            int Celsius = (int)((5.0/9) * (Fahrenheit-32));
            System.out.println(Fahrenheit + "\t" +Celsius);
        }
        sc.close();
    }
}
