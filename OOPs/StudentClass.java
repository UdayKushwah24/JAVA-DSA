package OOPs;

public class StudentClass {
    String name; // null
    int age;     // 0


    public void Intro_yourSelf() {
        SayMentorName();
        System.out.println("My Name is " + name + " and age is " + age);
    }

    public void SayHey(String name) {
        // System.out.println(name + " Say Hey " + name);  // Ram Say Hey Ram
        System.out.println(this.name + " Say Hey " + name);  // Sita Say Hey Ram
    }

    public static void SayMentorName() {
        // Intro_yourSelf();  -> give error
        System.out.println("Mentor Name -> Monu Bhaiya");
    }

    /* static {
        System.out.println("I am a in static blocks.");
    } */
}