/* 
Rules : 
 1. Only one disk transferred in 1 step.
 2. Smaller disks are always kept on top of larger disks.
 */
package Recursion;

public class Tower_of_Hanoi {
    public static void TowerOfHanoi(int n, String source , String helper, String destination){
        if (n == 1){
            System.out.println("The disk "+n+" is transfer from "+ source+" to "+destination);  
            return;          
        }
        TowerOfHanoi(n-1, source,destination, helper);
        System.out.println("The disk "+n+" is transfer from "+ source+" to "+destination);
        TowerOfHanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        int n = 4;
        TowerOfHanoi(n, "S", "H", "D");
    }
}
