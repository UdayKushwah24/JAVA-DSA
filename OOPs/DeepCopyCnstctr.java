package OOPs;

public class DeepCopyCnstctr {
    public static void main(String[] args) {
        Boy b1 = new Boy();
        b1.name = "Arav@839";
        b1.salary = 20000;
        b1.password = "Ar@v49";
        b1.marks[0] = 80;
        b1.marks[1] = 90;
        b1.marks[2] = 100;
        
        Boy b2 = new Boy(b1);   //copy the values of b1
        System.out.println(b2.name);
        System.out.println(b2.salary);
        b2.password = "uk8373";
        System.out.println(b2.password);
        
        b1.marks[1] = 100;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(b2.marks[i]);
        }
    }
}

class Boy {
    String name ;
    int salary ;
    String password ;
    int marks[];
    
    //Deep-Copy constructor 
    Boy( Boy b1) {
        marks = new int[3];
        this.name = b1.name;
        this.salary = b1.salary ;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = b1.marks[i];
        }
    }
    
    Boy() {
        marks = new int[3];
        System.out.println("Costructor is called........");
    }
}