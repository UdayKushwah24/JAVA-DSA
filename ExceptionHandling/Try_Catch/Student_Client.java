package ExceptionHandling.Try_Catch;

public class Student_Client {
    public static void main(String[] args) {
        Student s1 = new Student("Shyam",44);
        
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        
        s1.setName("Rohan");
        System.out.println(s1.getName());

        s1.setAge(-23);
        System.out.println(s1.getAge());

        System.out.println(".........End..........");
    }
}
