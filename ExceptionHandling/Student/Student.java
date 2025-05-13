package ExceptionHandling.Student;

public class Student {
    private String name ;
    private int age ;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) throws Exception {
        if(age < 0) {
            // exception ko generate karna
            throw new Exception("Age negative nhi hoti");
        }
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
