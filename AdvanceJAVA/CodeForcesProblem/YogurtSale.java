package AdvanceJAVA.CodeForcesProblem;
//Question URL : https://codeforces.com/problemset/problem/1955/A

/* 
 A. Yogurt Sale

time limit per test1 second
memory limit per test256 megabytes

The price of one yogurt at the "Vosmiorochka" store is a
 burles, but there is a promotion where you can buy two yogurts for b
 burles.

Maxim needs to buy exactly n
 yogurts. When buying two yogurts, he can choose to buy them at the regular price or at the promotion price.

What is the minimum amount of burles Maxim should spend to buy n
 yogurts?

Input
The first line contains a single integer t
 (1≤t≤104
) — the number of test cases.

The first and only line of each test case contains three integers n
, a
, and b
 (1≤n≤100
, 1≤a,b≤30
) — the number of yogurts Maxim wants to buy, the price for one yogurt, and the price for two yogurts on promotion.

Output
For each test case, print in a separate line the minimum cost of buying n
 yogurts at "Vosmiorochka".

Example
InputCopy
4
2 5 9
3 5 9
3 5 11
4 5 11
OutputCopy
9
14
15
20
Note
In the third test case of the example, it is more advantageous to buy three yogurts for 15
 burles than two for 11
 and one for 5
.

In the fourth test case of the example, you need to buy four yogurts, each for 5
 burles.
 */


import java.util.Scanner;
public class YogurtSale {

    // public static void CheckPrice(int n, int a , int b) {
    //     int sum = 0;
    //     while(n > 0){
    //         if (n == 1 || 2*a < b){
    //             sum += a;
    //             n = n - 1;
    //         }
    //         else if(2*a > b) {
    //             sum += b;
    //             n = n - 2;
    //          }
    //     }
    //     System.out.println(sum);
    // }
    public static void CheckPrice(int n, int a, int b) {
        int pairs = n / 2;   // Number of pairs of yogurts
        int remaining = n % 2; // Single yogurts left after forming pairs
        
        // Calculate the total price
        int totalPrice = pairs * Math.min(2 * a, b) + remaining * a;

        System.out.println(totalPrice);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int item[] = new int[n];
        // int a[] = new int[n];
        // int b[] = new int[n];
        // for (int i = 0; i < b.length; i++) {
        //     item[i] = sc.nextInt();
        //     a[i] = sc.nextInt();
        //     b[i] = sc.nextInt();
        //     CheckPrice(item[i], a[i],b[i]);

        // }
        sc.close();


        CheckPrice(3, 5, 9);
        CheckPrice(3, 5, 11);
        CheckPrice(4, 5, 11);
        // CheckPrice(5, 4, 9);
    }
}
