/* 
            5 4 3 2 1 0 1 2 3 4 5
              4 3 2 1 0 1 2 3 4 
                3 2 1 0 1 2 3 
                  2 1 0 1 2 
                    1 0 1 
                      0 
                    1 0 1 
                  2 1 0 1 2 
                3 2 1 0 1 2 3 
              4 3 2 1 0 1 2 3 4 
            5 4 3 2 1 0 1 2 3 4 5
 */

package AdvanceJAVA.SuperAssignment.Assignment_03;

public class HourGlass_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("--");
            }
            for (int j = n-i; j >= 0; j--) {
                System.out.print((j) +" ");
            }
            int val = 1;
            for (int j = i+1; j <= n; j++) {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
        // for (int i = n; i >= 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("--");
        //     }
        //     for (int j = n-i; j >= 0; j--) {
        //         System.out.print((j) +" ");
        //     }
        //     int val = 1;
        //     for (int j = i+1; j <= n; j++) {
        //         System.out.print(val+" ");
        //         val++;
        //     }
        //     System.out.println();
        // }
    
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("--");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print((i-j)+" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    
    }
}
