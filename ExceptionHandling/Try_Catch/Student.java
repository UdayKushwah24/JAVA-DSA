package ExceptionHandling.Try_Catch;

public class Student {
    private String name ;
    private int age ;

    //Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setAge(int age) {
        try {  // danger code written in this
            if(age < 0) {
                // exception ko generate karna
                throw new Exception("Age negative nhi hoti");
            }
        } catch(Exception e) {
            // Handle Exception
            e.printStackTrace();  // gives all detail in which line the error gives
            // System.out.println(e);
        }
        finally {
            // it run always
            System.out.println("I am a finally block.");
            System.exit(0);  // program ko terminate karna
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
