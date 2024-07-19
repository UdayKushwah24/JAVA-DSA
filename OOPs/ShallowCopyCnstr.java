package OOPs;

public class ShallowCopyCnstr {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Bhawana";
        t1.salary = 20000;
        t1.password = "Bh@w@n@.49";
        t1.marks[0] = 80;
        t1.marks[1] = 90;
        t1.marks[2] = 100;
        
        Teacher t2 = new Teacher(t1);   //copy the values of t1
        System.out.println(t2.name);
        System.out.println(t2.salary);
        t2.password = "uk8373";
        System.out.println(t2.password);
        
        t1.marks[1] = 100;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(t2.marks[i]);
        }
    }
}

class Teacher {
    String name ;
    int salary ;
    String password ;
    int marks[];
    
    //Shallow-Copy constructor 
    Teacher( Teacher t1) {
        marks = new int[3];
        this.name = t1.name;
        this.salary = t1.salary ;
        this.marks = t1.marks;
        // this.password = t1.password;
    }
    
    Teacher() {
        marks = new int[3];
        System.out.println("Costructor is called........");
    }
}