package Recursion.Hard;

public class TowerOfHanoi {

    public static void tower_of_hanoi(int n, String src, String helper, String dest) {
        if (n == 0) {
            return;
        }
        tower_of_hanoi(n - 1, src, dest, helper);
        System.out.println("Move " + n + "th disk from " + src + " to " + dest);
        tower_of_hanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        tower_of_hanoi(n, "A", "B", "C");
    }


    
    // Count the no. of movements
    /* 
    public static int TowerOfHanoi(int n, String src, String hlp, String des) {
        if(n == 0) {
            return 1;
        }
        int c1 = TowerOfHanoi(n-1, src, des, hlp);
        System.out.println("Move "+n+"th disk from "+src+" to "+des);
        int c2 = TowerOfHanoi(n-1, hlp, src, des);
        return c1+c2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(TowerOfHanoi(n,"A","B","C")-1);
    }
     */
}