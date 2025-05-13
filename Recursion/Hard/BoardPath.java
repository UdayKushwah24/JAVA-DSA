package Recursion.Hard;

public class BoardPath {
    // public static void Print(int n, int curr, String ans) {
    //     if(curr == n) {
    //         System.out.println(ans);
    //         return ;
    //     }
    //     if(curr > n) {
    //         return;
    //     }
       
    //     Print(n, curr+1, ans+1);
    //     Print(n, curr+2, ans+2);
    //     Print(n, curr+3, ans+3);
    // }

    // public static void Print(int n, int curr, String ans) {
    //     if(curr == n) {
    //         System.out.println(ans);
    //         return ;
    //     }
    //     if(curr > n) {
    //         return;
    //     }

    //     int no_of_dice = 3;
    //     for (int dice = 0; dice <= no_of_dice; dice++) {
    //         Print(n, curr+dice, ans+dice);
    //     }
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     Print(n,0,"");
    // }



    public static int Print(int n, int curr, String ans) {
        if(curr == n) {
            System.out.println(ans);
            return 1;
        }
        if(curr > n) {
            return 0;
        }

        int no_of_dice = 3;
        int x = 0;
        for (int dice = 1; dice <= no_of_dice; dice++) {
           x += Print(n, curr+dice, ans+dice);
        }
        return x;
    }
    public static void main(String[] args) {
        int n = 4;
        // Print(n,0,"");
        System.out.println("\n"+Print(n, 0, ""));
    }
}

