package Basic;
/* public class Ascii_Value {
    public static void main(String[] args) {
        /* char x = '#';
        // String x = "x";
        int y = x;
        System.out.println(x);
        System.out.println("Ascii value of 'a' = "+y);
 */
    /* 
        int u = 90;
        char y = (char)u;
        System.out.println(y);
}
}

 */ 


 public class Ascii_Value {
    public static void main(String[] args) {
        // Declaring and initializing char variables
        char letterA = 'A';
        char digitOne = '1';
        char symbolDollar = '$';
        char unicodeChar = '\u0041'; // Unicode for 'A'

        // Printing char variables
        System.out.println("Letter: " + letterA);
        System.out.println("Digit: " + digitOne);
        System.out.println("Symbol: " + symbolDollar);
        System.out.println("Unicode Character: " + unicodeChar);

        // Demonstrating numeric value of char
        int codePoint = letterA; // Implicit cast to int
        System.out.println("Unicode Code Point of 'A': " + codePoint);

        // Performing arithmetic operations
        char nextChar = (char) (letterA + 1);
        System.out.println("Next Character after 'A': " + nextChar);
    }
}
 