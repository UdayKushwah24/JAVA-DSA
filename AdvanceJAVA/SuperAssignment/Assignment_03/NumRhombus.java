/* 
                                1 
                              2 3 2 
                            3 4 5 4 3 
                          4 5 6 7 6 5 4 
                        5 6 7 8 9 8 7 6 5 
                          4 5 6 7 6 5 4 
                            3 4 5 4 3 
                              2 3 2 
                                1
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

import java.util.Scanner;

public class NumRhombus {
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
            int p = val;
            while(j<=star){
                System.out.print(p+" ");
                if(j <= star/2) {
                    p++;
                } else {
                    p--;
                }
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
