package OOPs;

public class Interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();

        Rook r1 = new Rook();
        r1.moves();
    }
}
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("Up,Down,Left,Right,diagonal (moves in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("moves horizontal and vertical direction ");
    }
}
class Pawn implements ChessPlayer{
    public void moves() {
        System.out.println("Up,Down,Left,Right (By 1 step)");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("Up,Down,Left,Right");
    }
}