package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
 

public class Practice {

    /* public static void SubSequences(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        SubSequences(str.substring(1), ans);
        SubSequences(str.substring(1), ans+ch);
    }
    public static void main(String[] args) {
        String str = "abc";
        SubSequences(str,"");
    } */


    /* public static void coin(int n,String ans ) {
        if(n == 0) {
            System.out.println(ans);
            return ;
        }
        coin(n-1, ans+"H");
        coin(n-1, ans+"T");
    }

    public static void main(String[] args) {
        int n = 3;
        coin(n, "");
    } */



   /*  public static void coin(int n,String ans ) {
        if(n == 0) {
            System.out.println(ans);
            return ;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
            coin(n-1, ans+"H");
        }
        coin(n-1, ans+"T");
    }

    public static void main(String[] args) {
        int n = 3;
        coin(n, "");
    } */



    /* public static void RollingDice(int n, int curr, String ans) {
        if(curr == n) {
            System.out.println(ans);
            return;
        }
        if(curr > n) {
            return;
        }
        //faces on dice : 1, 2, 3
        RollingDice(n, curr+1, ans+"1");
        RollingDice(n, curr+2, ans+"2");
        RollingDice(n, curr+3, ans+"3");
    }

    public static void main(String[] args) {
        int path = 4;
        RollingDice(path, 0, "");
    } */


    /* public static void GenetrateParenthesis(int n, int open,int close, String ans) {
        if(close == open && close == n) {
            System.out.println(ans);
            return;
        }
        if(open > n) {
            return ;
        }
        if(close > open) {
            return;
        }
        GenetrateParenthesis(n, open+1, close, ans+"(");
        GenetrateParenthesis(n, open, close+1, ans+")");
    }

    public static void main(String[] args) {
        int path = 10;
        GenetrateParenthesis(path,0, 0, "");
    } */

    /*
     public static boolean check_aage_hai(String str,int i,char ch) {
        boolean aageHai = true;
        for (int j = i+1; j < str.length(); j++) {
            if(str.charAt(j) == ch) {
                aageHai = false;
            }
        }
        return aageHai;
    }

    public static void Permutation(String str,String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(check_aage_hai(str, i, ch)) {
                String start = str.substring(0, i);
                String end = str.substring(i+1);
                Permutation(start+end, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abca";
        Permutation(str, "");
    }
*/




    /* public static void PrintSubstring(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        PrintSubstring(str.substring(1), ans);
        PrintSubstring(str.substring(1), ans+str.charAt(0));
    }
    public static void main(String[] args) {
        String str = "abc";
        PrintSubstring(str,"");
    } */  


    /* 
    // lexicographical counting : 
    public static void Lexicographical(int n,int curr) {
       
        if (curr > n) {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            Lexicographical(n, curr*10+i);
        }
    }
    public static void main(String[] args) {
        int n = 1000;
        Lexicographical(n,0);
    } 
    */
        
            




    /* public static void Toss_coin(int n, String ans) {
        if(n == 0) {
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {

            Toss_coin(n-1, ans+"H");
        }
        Toss_coin(n-1, ans+"T");
    }
    public static void main(String[] args) {
        int n = 4;
        Toss_coin(n, "");
    } */



    /* public static void RollDice(int boardSize, String path, int idx) {

        if(boardSize == 0) {
            System.out.println(path);
            return;
        }
        if(boardSize < 0) {
            return;
        }
        for (int i = idx; i <= 3; i++) {
            RollDice(boardSize-i, path+i,i);
        }
        // RollDice(boardSize-1, path+"1");
        // RollDice(boardSize-2, path+"2");
        // RollDice(boardSize-3, path+"3");
    }
    public static void main(String[] args) {
        int boardSize  = 6;
        RollDice(boardSize, "",1);
    } */



    /* public static void GenerateParenthesis(int n, int open, int close, String string) {
        if(open == n && close == n) {
            System.out.println(string);
            return;
        }
        if(open < n) GenerateParenthesis(n, open+1, close, string+"(");
        if(close < open) GenerateParenthesis(n, open, close+1, string+")");
    }
    public static void main(String[] args) {
        int n = 3;
        GenerateParenthesis(n,0,0,"");
    } */


    /* public static void GenerateParenthesis(int n, int open, int close, String string) {
        if(open == close && close == n) {
            System.out.println(string);
            return;
        }
        if(close > open) {
            return;
        }
        if(open > n) {
            return;
        }
        GenerateParenthesis(n, open+1, close, string+"(");
        GenerateParenthesis(n, open, close+1, string+")");
    }
    public static void main(String[] args) {
        int n = 3;
        GenerateParenthesis(n,0,0,"");
    } */


    /* 
    public static void Move(int n, int row, int col, String string) {
        if(row == n && col == n) {
            System.out.println(string);
            return;
        }
        if(row > n || col > n) {
            return;
        }
        Move(n, row+1, col, string+"H");
        Move(n, row, col+1, string+"V");
    }
    public static void main(String[] args) {
        int n = 4;
        Move(n,0,0,"");
    }      
    */ 
          
    


    /* public static boolean AggeHai(String str,int i) {
        for (int j = i+1; j < str.length(); j++) {
            if(str.charAt(i) == str.charAt(j)) {
                return true;
            }
        }
        return false;
    }
    public static void PrintPermutation(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(!AggeHai(str, i))
            PrintPermutation(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i)); 
        }
    }
    public static void main(String[] args) {
        String str = "abca";
        PrintPermutation(str,"");
    }  */   
     
    



    /* 
    // Phone combination
    static String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void PhoneCombination(String press, String ans) {
        if(press.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = press.charAt(0);
        int n = (ch-48);
        String str = key[n];
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            PhoneCombination(press.substring(1), ans+cha);
        }
    }
    public static void main(String[] args) {
        String press = "23";
        PhoneCombination(press, "");
    }
 */



    /* public static void QueenPermutation(boolean[] board, int tq, String string , int qpsf) {
        if(tq == qpsf) {
            System.out.println(string);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i] == false) {
                board[i] = true;
                QueenPermutation(board, tq, string+"b"+i+"q"+qpsf, qpsf+1);
                board[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int boxes = 4;
        int queen = 2;
        boolean[] board = new boolean[boxes];
        QueenPermutation(board,queen, "",0);
    } */




    /* public static void QueenCombination(boolean[] board, int tq, String string , int qpsf,int idx) {
        if(tq == qpsf) {
            System.out.println(string);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i] == false) {
                board[i] = true;
                QueenCombination(board, tq, string+"b"+i+"q"+qpsf+" ", qpsf+1,i);
                board[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int boxes = 4;
        int queen = 2;
        boolean[] board = new boolean[boxes];
        QueenCombination(board,queen, "",0,0);
    } */




    /* public static void CoinPermutation(int[] coin, int amount, String string) {
        if(amount == 0) {
            System.out.println(string);
            return;
        }

        for (int i = 0; i < coin.length; i++) {
            if(amount >= coin[i]) {
                CoinPermutation(coin, amount-coin[i], string+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 8;
        CoinPermutation(coin,target,"");
    } */



    /* public static void CoinPermutation(int[] coin, int target,int amount, String string) {
        if(amount == target) {
            System.out.println(string);
            return;
        }

        if(amount> target) {
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            CoinPermutation(coin, target,amount+coin[i], string+coin[i]);
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 8;
        CoinPermutation(coin,target,0,"");
    } */





    /* public static void coinCombination(int[] coin, int amount, String string, int idx) {
        if(amount == 0) {
            System.out.println(string);
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if(amount >= coin[i]) {
                coinCombination(coin, amount-coin[i], string+coin[i], i);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,1,4,5,6};
        int target = 8;
        coinCombination(coin,target,"",0);
    } */






    /* public static void coinCombination(int[] coin, int amount, List<Integer> ll, int idx,  List<List<Integer>> lst) {
        if(amount == 0) {
            lst.add(new ArrayList<>(ll));
            return;
        }
        
        for (int i = idx; i < coin.length; i++) {
            if(amount >= coin[i]) {
                ll.add(coin[i]);
                coinCombination(coin, amount-coin[i], ll, i,lst);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int target = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> lst = new ArrayList<>();
        coinCombination(coin , target , ll,0,lst);
        System.out.println(lst);
    }
 */


/* 
    // Partition of String
    public static void Partition(String str, String partition) {
        if(str.length() == 0) {
            System.out.println(partition);
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String s = str.substring(0, i);
            Partition(str.substring(i), partition + s+"|");
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        Partition(str,"");
    } 
    */





    /*
     // Palindrome Partition

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void PalindromePartition(String str, String partition) {
        if(str.length() == 0) {
            System.out.println(partition.substring(0,partition.length()-1));
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String s = str.substring(0, i);
            if(isPalindrome(s)) {
                PalindromePartition(str.substring(i), partition + s+"|");
            }
        }
    }           
    public static void main(String[] args) {
        String str = "nitin";
        PalindromePartition(str,"");
    } 

    */






    /* 
    // Rat Chases its cheese
    public static void display(int[][] path){
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean CheckPathExists = false;
    public static void Unique(char[][] board,int cr, int cc, int[][] path) {
        if(cr == board.length-1 && cc == board[0].length-1) {
            path[cr][cc] = 1;
            display(path);
            CheckPathExists = true;
            return;
        }
        if(cr >= board.length || cc >= board[0].length || cr < 0 || cc < 0 || board[cr][cc] == 'X') {
            return;
        }
        board[cr][cc] = 'X';
        path[cr][cc] = 1;
        Unique(board, cr+1, cc, path);
        Unique(board, cr, cc+1, path);
        Unique(board, cr-1, cc, path);
        Unique(board, cr, cc-1, path);
        board[cr][cc] = 'O';
        path[cr][cc] = 0;
    }
    public static void main(String[] args) {
        int row = 5;
        int col = 4;
        char[][] board = {{'O','X','O','O'},
                          {'O','O','O','X'},
                          {'X','O','X','O'},
                          {'X','O','O','X'},
                          {'X','X','O','O'}};
        int[][] path = new int[row][col];
        Unique(board,0,0,path);
        if(CheckPathExists == false) {
            System.out.println("NO PATH FOUND.");
        }
    }
     */





    
    /* 
    // Search word in a board.
    public static boolean Search(char[][] board, String word, int cr, int cc, int idx) {

        if(idx == word.length()) {
            return true;
        }
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) {
            return false;
        }
        board[cr][cc] = '*';
        int[] r = {0,1,0,-1};       
        int[] c = {1,0,-1,0}; 
        for (int k = 0; k < r.length; k++) {
            boolean ans = Search(board, word, cr+r[k], cc+c[k], idx+1);
            if(ans) {
                return ans;
            }
        } 
        board[cr][cc] = word.charAt(idx);
        return false;
    }
    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCCED";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                if(Board[i][j] == word.charAt(i)) {
                    boolean ans = Search(Board,word,i,j,0);
                    if(ans) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
        }
        System.out.println(false);
    }
    
 */



 /* 
    // Search word in a board.
    static boolean IsFound = false;
    public static void Search(char[][] board, String word, int cr, int cc, int idx) {

        if(idx == word.length()) {
            IsFound = true;
            return ;
        }
        if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(idx)) {
            return ;
        }
        board[cr][cc] = '*';
        int[] r = {0,1,0,-1};       
        int[] c = {1,0,-1,0}; 
        for (int k = 0; k < r.length; k++) {
            Search(board, word, cr+r[k], cc+c[k], idx+1);
        } 
        board[cr][cc] = word.charAt(idx);
        
    }
    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCED";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                if(Board[i][j] == word.charAt(i)) {
                    Search(Board,word,i,j,0);
                }
            }
        }
        System.out.println(IsFound);
    } */
    




/* 
    //Tower of Hanoi
    public static int TowerOfHanoi(int n, String src, String hlp, String des) {
        if(n == 0) {
            return 1;
        }
        int s1 = TowerOfHanoi(n-1, src, des, hlp);
        System.out.println("Move "+n+"th disk from "+src+" to "+des);
        int s2 = TowerOfHanoi(n-1, hlp, src, des);
        return s1+s2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(TowerOfHanoi(n,"A","B","C")-1);
    }
 */





/* 
    // N Queen Permutation :
    public static void display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean IsSafe(boolean[][] board, int row, int col) {
        // up
        int r = row;
        while (r >= 0) {
            if(board[r][col] == true) {
                return false;
            }
            r--;
        }
        // Left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if(board[r][c] == true){
                return false;
            }
            r--;
            c--;
        }
        // Right Diagonal
        r = row;
        c = col;
        while (c < board.length && r>=0) {
            if(board[r][c] == true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static void QueenProblem(boolean[][] board, int tq, int row) {
        if(tq == 0) {
            display(board);
            System.out.println();
            return;
        }
        
        for (int col = 0; col < board.length; col++) {
            if(IsSafe(board, row, col) == true) {
                board[row][col] = true;
                QueenProblem(board, tq-1, row+1);
                board[row][col] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        QueenProblem(board, n, 0);
    }


 */







/* 
    // Suduko Solver
    public static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isItSafe(int[][] grid, int row, int col, int val) {
        // col
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][col] == val) {
                return false;
            }
        }
        // row
        for (int i = 0; i < grid.length; i++) {
            if(grid[row][i] == val) {
                return false;
            }
        }
        // check for 3x3 grid
        row = row - row % 3;
        col = col - col % 3;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                if(grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Suduko(int[][] grid, int row, int col) {
        if(col == 9) {
            col = 0;
            row++;
        }
        if(row == 9) {
            Display(grid);
            return;
        }
        if(grid[row][col] != 0) {
            Suduko(grid, row, col+1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if(isItSafe(grid,row,col,val) == true) {
                    grid[row][col] = val;
                    Suduko(grid, row, col+1);
                    grid[row][col] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        Suduko(grid, 0, 0);
    } 
        
    */



/* 
    // Leetcode-39 : Combination Sum
    public static void Combination(List<List<Integer>> list,  List<Integer> ll,int[] candidates, int target , int idx) {
        if(0 == target) {
            list.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if(target>= candidates[i]) {
                ll.add(candidates[i]);
                Combination(list, ll, candidates, target-candidates[i],i);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(list,ll, candidates, target,0);
        System.out.println(list);
    }

 */


    /* static boolean isExists = false;
    public static void Search(char[][] board, String word, int row, int col,int idx) {
        if(word.length() == idx) {
            isExists = true;
            return;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx)) {
            return ;
        }

        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        board[row][col] = '*';
        for (int i = 0; i < c.length; i++) {
            Search(board, word, row+r[i], col+c[i], idx+1);
        }
        board[row][col] = word.charAt(idx);
    }

    public static void main(String[] args) {
        char[][] Board = { {'A','B','C','E'}, 
                           {'S','F','C','S'}, 
                           {'A','D','E','E'} };
        String word = "ABCB";
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                if(Board[i][j] == word.charAt(0)) {
                    Search(Board, word,i,j,0);
                }
            }
        }
        System.out.println(isExists);
    } */
          
    



    /* 
     // Leetcode-40 : Combination Sum
     public static void Combination(List<List<Integer>> list,  List<Integer> ll,int[] candidates, int target , int idx) {
        if(0 == target) {
            list.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if(i > idx && candidates[i] == candidates[i-1]) continue;
            if(target>= candidates[i]) {
                ll.add(candidates[i]);
                Combination(list, ll, candidates, target-candidates[i],i+1);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(list,ll, candidates, target,0);
        System.out.println(list);
    } 
    */









/* 
    // Combination Sum 3 ;
    public static void Combination(List<List<Integer>> list,  List<Integer> ll,int k, int n , int idx) {
        if(ll.size() == k && n == 0) {
            list.add(new ArrayList<>(ll));
            return;
        }
        
        for (int i = idx; i <= 9; i++) {
            if(n >= i) {
                ll.add(i);
                Combination(list, ll, k, n-i, i+1);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int  k = 2;
        int n = 18;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(list,ll, k, n,1);
        System.out.println(list);
    }
     */




/*      // combinations 77 :

    public static void Combination(List<List<Integer>> list, List<Integer> ll, int n, int k, int idx) {
        if(ll.size() == k) {
            list.add(new ArrayList<>(ll));
            return;
        }
        
        for (int i = idx; i <= n; i++) {
            ll.add(i);
            Combination(list, ll, n, k,i+1);
            ll.remove(ll.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(list,ll,n,k,1);
        System.out.println(list);
    } */



/* 
    // subset
    public static void Subset( int[] nums,List<List<Integer>> list, List<Integer> ll, int i) {
       
        if(nums.length == i) {
            list.add(new ArrayList<>(ll));
            return;
        }
        Subset(nums, list, ll,i+1);
        ll.add(nums[i]);
        Subset(nums, list, ll,i+1);
        ll.remove(ll.size()-1);
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Subset(nums,list, ll,0);
        System.out.println(list);
    } 
        
    */



/* 
    // N-queens : 51

    public static boolean IsItSafe(boolean[][] board, int row, int col) {
        int r = row;
        while (r >= 0) {
            if(board[r][col]) {
                return false;
            }
            r--;
        }

        r = row;
        int c = col;
        while (r>= 0 && c >= 0) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r>= 0 && c < board.length) {
            if(board[r][c]) {
                return false;
            }
            r--;
            c++;;
        }
        return true;
  
    }
    public static void Display(List<List<String>> list, boolean[][] board) {
        List<String> ll = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = "";
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]){
                    s += 'Q';
                } else {
                    s += '.';
                }
            }
            ll.add(s);
        }
        list.add(ll);
    }
    public static void Queen(List<List<String>> list, boolean[][] board, int tq, int row) {
        if(tq == 0) {
            Display(list,board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(IsItSafe(board,row, col)) {
                board[row][col] = true;
                Queen(list, board, tq-1, row+1);
                board[row][col] = false;
            }
        }
 
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> list = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        Queen(list,board,n,0);
        System.out.println(list);
    }

 */


/* 
    // 1812
    public static boolean squareIsWhite(String coordinates) {
        char ch1 = coordinates.charAt(0);
        System.out.println(ch1);
        int col = ch1 - 'a';
        System.out.println(col);
        char ch2 = coordinates.charAt(1);
        System.out.println(ch2);
        int row =  ch2 - '0';
        if((row+col)%2 == 0){
            return true;
        } else {
            return false;
        }
        // if((row%2 == 0 && col %2 == 0 )||( row%2 == 1 && col%2 == 1)) {
        //     return true;
        // } else {
        //     return false;
        // }
    }
    public static void main(String[] args) {
        String coordinates = "a1";
        System.out.println(squareIsWhite(coordinates));
    }
 */




/* 

    public static void LetterPermutation(List<String> lst, String s, int i, String ans) {
        
        if(i == ans.length()) {
            lst.add(ans);
            return;
        }
        char ch = s.charAt(0);
        int ascii = (int)(ch);
        if(ascii>=65 && ascii<=90) {
            LetterPermutation(lst, s.substring(1), i , ans+ch);
            char d = (char)(ch+32);
            LetterPermutation(lst, s.substring(1), i , ans+d);
            
        }  else if(ascii>=97 && ascii<=122){
            LetterPermutation(lst, s.substring(1), i , ans+ch);
            char d = (char)(ch-32);
            LetterPermutation(lst, s.substring(1), i , ans+d);
        }
        else {
            LetterPermutation(lst, s.substring(1), i , ans+ch);

        }
    }
    public static void main(String[] args) {
        String s = "a1b2";
        List<String> lst = new ArrayList<>();
        LetterPermutation(lst,s,s.length(),"");
        System.out.println(lst);
        // System.out.println((int)('a'));
    } */

    
    public static boolean isItSafe(int[][] grid, int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if(grid[i][col] == val) {
                return false;
            } 
        }
        for (int i = 0; i < 9; i++) {
            if(grid[row][i] == val) {
                return false;
            } 
        }

        row = row - row % 3;
        col = col - col % 3;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                 
                if(grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Suduko(int[][] grid, int row, int col) {
        
        if(col == 9) {
            col = 0;
            row++;
        }
        if(row == 9) {
            Display(grid);
            return;
        } 
        if(grid[row][col] != 0) {
            Suduko(grid, row, col+1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if(isItSafe(grid, row , col, val)) {
                    grid[row][col] = val;
                    Suduko(grid, row, col+1);
                    grid[row][col] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] grid = {{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                        { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                        { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                        { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                        { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                        { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                        { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        Suduko(grid,0,0);
    }
}
