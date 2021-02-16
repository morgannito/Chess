package game.boardException;

import game.Coord;

/**
 * Called when the user move out of the matrix
 */

public class IllegalPosition extends Exception {
    public IllegalPosition(String message){ super (message); };
}
