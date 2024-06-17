package Object_Oriented_Programming;
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy....");
    }
    public void run(){
        System.out.println("Running the enemy....");
    }
    public void fire(){
        System.out.println("Firing the enemy....");
    }
}
public class Practice_05 {
    public static void main(String[] args) {
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.fire();
        player1.run();
    }
}
