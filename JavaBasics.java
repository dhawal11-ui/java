// - Multiple inheritence (5th).
// - To achieve total abstraction. (100% abstraction)
// - Define via interface keyword and copy properties in child via implements keyword .
// - All methods are public , abstract, without implementation(no function define in code only name of the fucntion.) .
//- Variables in interfaces are final , public , static.
public class JavaBasics {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Herbivore {

}
interface Carnivore {

}

class Bear implements Herbivore , Carnivore {
    
}

interface ChessPlayer {
    void moves(); // bluprint.
}

class Queen implements ChessPlayer {
    public void moves() {
        System.err.println("up , down , left , right , diagonal(all sides) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.err.println("up , down , left , right  ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.err.println("up , down , left , right , diagonal by(1 step) ");
    }
}
