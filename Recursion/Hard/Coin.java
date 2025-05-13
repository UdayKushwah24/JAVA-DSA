package Recursion.Hard;

public class Coin {

    // public static void FindPath(int n, int curr,String ans){
    //     if(curr == n) {
    //         System.out.print(ans+" ");
    //         return;
    //     }
    //     if(curr>n) {
    //         return;
    //     }

    //     //dice has a three face i.e. 1,2,3 .
    //     FindPath(n, curr+1, ans+"1");
    //     FindPath(n, curr+2, ans+"2");
    //     FindPath(n, curr+3, ans+"3");
    // }


    public static void FindPath(int n, int curr,String ans){
        if(curr == n) {
            System.out.print(ans+" ");
            return;
        }
        if(curr>n) {
            return;
        }

        //dice has a three face i.e. 1,2,3 .
        int no_of_dice = 3;
        for (int dice = 1; dice <=no_of_dice; dice++) {
            FindPath(n, curr+dice, ans+dice);
        }
        // FindPath(n, curr+1, ans+"1");
        // FindPath(n, curr+2, ans+"2");
        // FindPath(n, curr+3, ans+"3");
    }

 
    public static int CountandFindPath(int n, int curr,int ans){
        if(curr == n) {
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>n) {
            return 0;
        }
        //dice has a three face i.e. 1,2,3 .
        int a1 = CountandFindPath(n, curr+1, ans*10+1);
        int a2 = CountandFindPath(n, curr+2, ans*10+2);
        int a3 = CountandFindPath(n, curr+3, ans*10+3); 
        return a1+a2+a3;
    }

    public static void main(String[] args) {
        int n = 5; //boards size
        FindPath(n, 0, "");
        System.out.println("\n"+CountandFindPath(n, 0, 0));
    }
} 
