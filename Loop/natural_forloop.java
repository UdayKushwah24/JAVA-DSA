package Loop;

import java.util.Scanner;
public class natural_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int num = 1;num<=n;num++){
            System.out.println(num);
        }
        sc.close();
    }
}