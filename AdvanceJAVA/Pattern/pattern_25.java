package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
