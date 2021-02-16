package game.boardException;
import game.Coord;

/**
 * Called when the user move out a legal position of piece
 */

public class IllegalMove extends Exception {
    public IllegalMove(String message){ super (message); };
}
