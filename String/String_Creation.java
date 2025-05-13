package String;

public class String_Creation {
    public static void main(String[] args) {
        String s1 = "hello"; // create inside string intern pool
        String s2 = "hello"; // create inside string intern pool
        String s3 = new String("hello"); // create in heap
        String s4 = new String("hello"); // create in heap
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s2); // false
        System.out.println(s3 == s2); // false

        s1 = s1 + "bye"; // s1 = s1.concat("bye");
        String s5 = "hello" + "bye"; // create inside string intern pool
        String s6 = "hello" + "bye"; // create inside string intern pool
        System.out.println(s5 == s6); // true

        System.out.println("hello" + 10 + 20 + "bye"); // hello1020bye
        System.out.println("hello" + (10 + 20) + "bye"); // hello30bye first bracket solve
        System.out.println(10 + 20 + "hello" + "bye"); // 30hellobye
        System.out.println(10 + 20 + "hello" + "bye" + 34 + 56); // 30hellobye3456

        // In java string is immutable but not in C++
        // copy of string is made outside the String Intern Pool
        // Immutable means we can not change the same string at same location
        // == compare the address of string
        // .equalsto compare the content of string

        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        int[] arr = { 1, 2, 3, 4 };
        System.out.println(str.length()); // brackets are used so it is method or function
        System.out.println(arr.length); // brackets not are used so it is a variable

        // SubString : continous part of a string
        System.out.println(str.substring(3)); // give the remaining string after index 3
        System.out.println(str.substring(3, 4));
    }
}
// Premitive data me == content store karega. Non-premitive data me == address
// store karega.