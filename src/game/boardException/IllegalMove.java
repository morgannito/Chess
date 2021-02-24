package game.boardException;
import game.Coord;



/**
 * @author Morgann Riu
 * Illegal Move
 */
public class IllegalMove extends Exception {

    /**
     * Illegal Move
     * @param message message
     */
    public IllegalMove(String message){ super (message); };
}
