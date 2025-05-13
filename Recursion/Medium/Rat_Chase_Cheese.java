package Recursion.Medium;

import java.util.Scanner;

public class Rat_Chase_Cheese {

    public static void display(int[][] path){
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path.length; j++) {
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Print( char[][] maze,int[][] path,int cr,int cc) {
        if(cc < 0 || cr < 0 || cr >=maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return ;
        }
        if(cr == maze.length-1 && cc == maze[0].length-1) {
            path[cr][cc] = 1;
            display(path);
        }
        maze[cr][cc] = 'X';
        path[cr][cc] = 1;
        
        
        maze[cr][cc] = 'O';
        path[cr][cc] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] maze = new char[m][n];
        int[][] path = new int[m][n];
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        Print(maze,path,0,0);
        // for (int i = 0; i < maze.length; i++) {
        //     for (int j = 0; j < maze.length; j++) {
        //         System.out.print(path[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
