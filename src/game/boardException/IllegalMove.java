package game.boardException;
import game.Coord;

/**
 * Illegal Move
 */
public class IllegalMove extends Exception {

    /**
     * Illegal Move
     * @param message message
     */
    public IllegalMove(String message){ super (message); };
}
