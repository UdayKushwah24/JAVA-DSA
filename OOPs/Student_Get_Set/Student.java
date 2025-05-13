package OOPs.Student_Get_Set;

public class Student {
    private String name ;
    private int age ;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 0) {
            return;
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
}
