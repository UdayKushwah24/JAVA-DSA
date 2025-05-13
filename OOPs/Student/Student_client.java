package OOPs.Student;

public class Student_client {
    
    public static void main(String[] args) {
        System.out.println("Hellooooooooooo");
        Student s = new Student();
        System.out.println("Hii");
        s.name = "Ram";
        s.age = 21;
        s.Intro_yourself();
        // s.MentorName();   // The static method MentorName() from the type Student should be accessed in a static way
        // mentor name common to all student

        // static method can bo called by class name.
        Student.MentorName();
        
        
        Student s1 = new Student();
        s1.name = "Shyam";
        s1.age = 25;
        s1.Intro_yourself();
        s.SayHey("Rahul");
        Student.MentorName();

    }
    static {
        System.out.println("I am in Student client.");
    }
}
