package game.boardException;

import game.Coord;

/**
 * @author Morgann Riu
 * Called when the user move out of the matrix
 */

public class IllegalPosition extends Exception {

    /**
     * Illegal Position
     * @param message  message
     */
    public IllegalPosition(String message){ super (message); };
}
