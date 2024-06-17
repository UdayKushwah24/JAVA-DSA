package Basic;
import java.util.Scanner;
public class input_user{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int radius;
        radius = sc.nextInt();
        System.out.print("Area of circle is : "+ 3.14*radius*radius);
        sc.close();
    }
}
// import java.util.Scanner; // Import the Scanner class

// public class UserInputExample {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input from System.in
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a string
//         System.out.print("Enter a string: ");
//         String userInputString = scanner.nextLine();
//         System.out.println("You entered: " + userInputString);

//         // Prompt the user to enter an integer
//         System.out.print("Enter an integer: ");
//         int userInputInt = scanner.nextInt();
//         System.out.println("You entered: " + userInputInt);

//         // Prompt the user to enter a floating-point number
//         System.out.print("Enter a floating-point number: ");
//         float userInputFloat = scanner.nextFloat();
//         System.out.println("You entered: " + userInputFloat);

//         // Close the scanner to avoid resource leaks
//         scanner.close();
//     }
// }
