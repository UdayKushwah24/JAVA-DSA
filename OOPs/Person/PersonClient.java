// error can not be resolve.
// exception can be handle.

package OOPs.Person;

public class PersonClient {
    public static void main(String[] args) { // throws Exception
        Person p = new Person();
        // System.out.println(p.name);
        // System.out.println(p.age);

        Person p1 = new Person("Kaushal",83);
        // System.out.println(p1.name);
        // System.out.println(p1.age);
        // p1.age = 67;

        // Person p2 = new Person("Ankita",183);
        // p2.age = 23;

        // Encapsulation
        p1.setAge(-23);
        System.out.println(p1.getAge());
        
    }
}
