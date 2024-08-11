/* 
FRIENDS PAIRING PROBLEM :
Given n friends, each one can remain single or can be paired up with some other 
friend. Each friend can be paired only once . Find out the total no. ways in which
friends can remain single or can be paired up.
 */
package Recursion_Problem;

public class FriendsPair {
    public static int FriendPairing(int n){
        if(n==1 || n==2) return n;
        
        //Choices
        //Single
        //Pair with one of the n-1 friends
        int fnm1 = FriendPairing(n-1);

        //pairing choices
        int fnm2 = FriendPairing(n-2);
        int pairWays = (n-1)*fnm2;

        int totalways = fnm1 + pairWays;

        return totalways;

        //Single Line Statement
        // return FriendPairing(n-1) + (n-1)*FriendPairing(n-2);
            
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(FriendPairing(n));
    }
}
