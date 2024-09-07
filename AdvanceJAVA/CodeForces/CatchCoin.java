package AdvanceJAVA.CodeForces;

import java.util.Scanner;

public class CatchCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            // int x = sc.nextInt();
            int y = sc.nextInt();
            if(y <= -2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            n--;
       }
       sc.close();
    }
}
