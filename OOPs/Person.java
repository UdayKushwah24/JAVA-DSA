package OOPs;

public class Person {
    // private String name = "Rohan";
    // private int age = 23;

    String name = "Rohan";
    int age = 23;

    //default constructor created by java in runtime
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void SetAge(int age) {
        this.age = age;
    }
    public int GetAge() {
        return age;
    }
}
