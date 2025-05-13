package OOPs.Student;

public class Student {
    String name;
    int age;

    public  void Intro_yourself() {
        System.out.println("My name is " + name + " and age is " + age + " .");
    }

    public static void MentorName() {
        System.out.println("Monu Bhaiya........");
    }

    public void SayHey(String name) {
        System.out.println(this.name + " say hey " + name);
    }
    // Static block -> executes first
    static {
        System.out.println("I am in Student");
    }
    // static {
    //     System.out.println("I am in Student 2");
    // }
}
