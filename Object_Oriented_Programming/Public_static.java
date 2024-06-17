package Object_Oriented_Programming;

public class Public_static {
    static void static_method(){
        System.out.println("static method can be called without creating an object");
    }
    public void public_method(){
        System.out.println("Public method must be called by creating an object");
    }

    public static void main(String[] args) {
    static_method();  //call the static method

    Public_static pm = new Public_static();  //create an object
    pm.public_method();  //call the public method
    
    }
}
