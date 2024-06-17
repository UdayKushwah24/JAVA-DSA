package Object_Oriented_Programming;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
       System.out.println("& My Name is "+name+".");
       System.out.println("My Id is "+id);
    } 
    public String GetSalary(String name,int salary){
        return name+"'s salary is "+salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class.");
        Employee Uday = new Employee(); //instantiating a new Employee object
        Employee John = new Employee(); //instantiating a new Employee object
        //Setting attributes for uday
        Uday.id = 12;   
        Uday.name = "Uday Kushwah";
        Uday.salary = 12000;

        //Setting attributes for John
        John.id = 13;
        John.name = "John Khandelwal";
        John.salary = 10000;
        
        //printing the attributes
        Uday.printDetails();
        John.printDetails();
        System.out.println(Uday.GetSalary(Uday.name,Uday.salary));
        System.out.println(John.GetSalary(John.name,John.salary));

       /*  
        System.out.println(Uday.id);
        System.out.println(Uday.name); */
    }
}