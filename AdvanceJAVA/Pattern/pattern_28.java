package Super150_Batch.Pattern;

import java.util.Scanner;

public class pattern_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int num = 1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("--");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(num+" ");
                num+=1;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
