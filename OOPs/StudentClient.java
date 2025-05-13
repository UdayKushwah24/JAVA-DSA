package OOPs;

public class StudentClient {
    public static void main(String[] args) {
        System.out.println("Beginning of code.......");
        StudentClass student1 = new StudentClass();
        System.out.println(student1.name); // null
        System.out.println(student1.age); // 0
        student1.name = "Rohan";
        student1.age = 28;
        student1.Intro_yourSelf();

        // new object
        StudentClass student2 = new StudentClass();
        student2.name = "Sita";
        student2.age = 34;
        student2.Intro_yourSelf();
        student2.SayHey("Ram");

        StudentClass.SayMentorName();
        // student1.SayMentorName();


    }
    /* static {
        System.out.println("I am a in static blocks in Main.");
    } */
}
