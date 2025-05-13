package OOPs;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);

       
        Person p2 = new Person("Kajal",21);
        System.out.println(p2.name);
        System.out.println(p2.age);

       
        Person p3 = new Person("Shyam",12);
        System.out.println(p3.name);
        System.out.println(p3.age);

        p2.SetAge(25);
        System.out.println(p2.GetAge());
    }
}
