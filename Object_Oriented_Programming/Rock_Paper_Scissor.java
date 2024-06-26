package Object_Oriented_Programming;

import java.util.Random;
import java.util.Scanner;
// import java.util.random.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        // 0 for Rocks
        // 1 for Paper
        // 2 for Scissors
        String[] arr = {"Rocks","Paper","Scissor"};
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter 0 for Rocks, 1 for Paper, 2 for Scissors : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userInput == 0 || userInput == 1 || userInput == 2){
            System.out.println("Computer Input : "+arr[computerInput]);
            if (userInput == computerInput){
                System.out.println("Draw !!!");
            }
            else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput ==0 || userInput==2 && computerInput == 1){
                System.out.println(" You win !!");
            }
            else{
                
                System.out.println(" Computer win !!");
            }
        }
        else {
            System.out.println();
            System.out.println("Invalid Choice !!");
            System.out.println();
        }
        sc.close();
    }
}