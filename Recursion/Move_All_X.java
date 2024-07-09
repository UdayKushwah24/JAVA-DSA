package Recursion;

public class Move_All_X {
    public static void moveAll_X (String s, int ind ,int count,String newstring){
        if(ind == s.length()){
            for(int i=0;i<count;i++){
                newstring += 'x';
            }
            System.out.println(newstring);
            return ;
        }
        if(s.charAt(ind) == 'x'){
            count++;
            moveAll_X(s, ind+1, count, newstring);
        } else {
            newstring += s.charAt(ind);
            moveAll_X(s, ind+1, count, newstring);
        }
    }
    public static void main(String[] args) {
        String s = "axbcxxd";
        moveAll_X(s,0,0,"");

    }
}
