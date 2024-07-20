package OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        // Student1 s1 = new Student1();
        // s1.setName("Haresh");
        // System.out.println(s1.getName());

        // s1.schoolName = "Saraswati Vidhya School.";
        // Student1 s2 = new Student1();
        // // System.out.println(s2.schoolName);
        // System.out.println(s2.returnPercentage(88, 69, 96));

        // Student1 s3 = new Student1();
        // s3.schoolName = "ABS Convent School.";
        // System.out.println(s2.schoolName);
        // System.out.println(s3.returnPercentage(85, 85, 38));

    }
}
class Student1{
    String name;
    int rollno;

    //static variable
    static String schoolName ;
    void setName(String name ) {
        this.name = name ;
    }
    String getName() {
        return this.name;
    }

    //static function
    static double returnPercentage(int maths, int phy, int chem) {
        return (maths+phy+chem)/3;
    }
}