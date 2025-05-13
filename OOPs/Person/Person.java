package OOPs.Person;

public class Person {
    private String name = "Raj";
    private int age = 23;
    // constructor-default
    // can have many constructor but having different parameter
    // three steps before constructor calling :-
    // 1. mememory allocation
    // 2. parsing
    // 3. constructor calling
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){ // throws : 
        try {

            if(age < 0) {
                throw new Exception("Age can not be negative.");
                // throw : generate the exception
            }
            this.age = age;
        }
        catch(Exception e) {
            e.printStackTrace();
        } 
        finally{
            System.out.println("this is a finally block.");
        }
    }

   /*  public void setAge(int age) throws Exception{ // throws : 
        if(age < 0) {
            throw new Exception("Age can not be negative.");
            // throw : generate the exception
        }
        this.age = age;
    } */
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    
}
