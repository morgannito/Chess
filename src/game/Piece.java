package game;

import game.boardException.IllegalMove;
import game.boardException.IllegalPosition;

/**
 * Mother class for all pieces of chessboard
 */

public abstract class Piece {
    protected ChessBoard board;
    protected Coord place;
    protected Color col;

    //Getter

    /**
     *
     * @return  Coord
     */
    public Coord getPlace() { return place; }

    /**
     *
     * @return  ChessBoard
     */
    public ChessBoard getBoard() { return board; }

    /**
     *
     * @return  Color
     */
    public Color getCol() { return col; }

    protected abstract void move(Coord c) throws IllegalMove, IllegalPosition;
}

