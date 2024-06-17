package Methods;

import java.util.Scanner;
public class natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
