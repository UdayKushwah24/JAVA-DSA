package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.name);

        Employee e2 = new Employee("Shyam Sundar");
        System.out.println(e2.name);

        Employee e3 = new Employee(749939);
        System.out.println(e3.Id);

        Employee e4 = new Employee("Gopal Das",749900);
        System.out.println(e4.Id + "\n"+ e4.name);
    }
}

class Employee {
    String name ;
    int Id;
    //Non-parameterized constructor
    Employee () {
        System.out.println("Constructor called.....");
    }
    //Parameterized Constructor
    Employee(String newname ) {
        this.name = newname ;
    }
    //Parameterized Constructor
    Employee(int id ) {
        this.Id = id;
    }
    //Parameterized Constructor
    Employee(String name , int id ) {
        this.name = name ;
        this.Id = id;
    }
}
