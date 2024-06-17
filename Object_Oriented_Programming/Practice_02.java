package Object_Oriented_Programming;
class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }        
    public void vibrate(){
        System.out.println("Vibrating....");
    }        
    public void callFriend(){
        System.out.println("Calling Uday....");
    }        
}
public class Practice_02 {
    
    public static void main(String[] args) {
        cellphone vivo = new cellphone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();
    }
}
