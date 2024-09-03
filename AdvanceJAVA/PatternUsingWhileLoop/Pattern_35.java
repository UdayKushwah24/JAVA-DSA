/* 
                    1 
                  2 2 2 
                3 3 3 3 3 
              4 4 4 4 4 4 4 
            5 5 5 5 5 5 5 5 5 
              4 4 4 4 4 4 4 
                3 3 3 3 3 
                  2 2 2
                    1
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_35 {
    
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int star = 1;
        int space = n-1;
        int val = 1;
        int row = 1;
        while (row<=2*n-1){
            //Space
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //Star
            int j = 1;
            while(j<=star){
                System.out.print(val+" ");
                j++;
            }
            //Mirroring
            if(row<n){
                space--;
                star+=2;
                val++;
            }else{
                space++;
                star-=2;
                val--;
            }
            //Next Row Prep
            System.out.println();
            row++;
        }
        sc.close();
    }
    
    
    
}
