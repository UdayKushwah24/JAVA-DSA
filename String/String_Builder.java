/* 
 String Builder(mutable) and String Buffer are same.
 Synchronization : String Buffer 
 StringBuilder : 2x(oldcapacity) + 2
 ArrayList : oldcapacity + oldcapacity/2

 */
package String;

public class String_Builder {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder();
        // System.out.println(str.capacity()); //16

        // StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb.capacity()); //16+sb.length = 16+5 = 21

        // StringBuilder s = new StringBuilder();
        // s.append("uday");
        // s.append("49");
        // s.append(true);
        // s.append(98.0);
        // System.out.println(s);
        // // System.out.println(s.length());
        // System.out.println(s.capacity());

        // System.out.println(s.charAt(3));
        // System.out.println(s.reverse());
        // System.out.println(s.delete(0, 4));
        // System.out.println(s.substring(0,5));

        // //convert the string builder to string
        // String new_Str = s.toString();
        // System.out.println(new_Str);

        // String p = "";
        // for (int i = 0; i < 10000; i++) {
        // p+=i;
        // }
        // System.out.println(p);
        StringBuilder q = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            q.append(i);
        }
        System.out.println(q);

    }
}
