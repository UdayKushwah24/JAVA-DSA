package String;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        System.out.println(a);
        System.out.println(a1);
        // Long l = 10l;
        // Character ch = 'a';
        // Boolean c = true;
        Integer b = a;    //Auto-Boxing : convert of primitive datatype to non-primitive datatype
        int z = a1;    //Un-Boxing : convert of non primitive datatype to primitive datatype

        Character c1 = 18;
        Character c2 = 18;
        Character c3 = 181;
        Character c4 = 181;
        /* 
        for Byte, Short, Integer, Long :
        Cache is the name of array of size 256,
        c1,c2 belongs to range (-128 to 127) within this range having same address , so output is true
        If outside this range ,address are different , so output is false
         */
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);

        /* 
        for Boolean,Character, Double,
         */
        Boolean b1 = false;
        Boolean b2 = false;
        System.out.println(b1 == b2);

        Character s1 = 'z';
        Character s2 = 'z';
        System.out.println(s1==s2);
    }
}
