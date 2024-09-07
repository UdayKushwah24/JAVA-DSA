package AdvanceJAVA.SuperAssignment.Assignment_04;
import java.util.Scanner;
public class Series {
    
    public static void PrintSeries(int n1, int n2) {
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            int s = 3*i+2;
            if( s % n2 != 0) {
                System.out.println(s);
                count++;
            }
            if(count == n1) {
                return;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        PrintSeries(n1,n2);
        sc.close();
    }
}