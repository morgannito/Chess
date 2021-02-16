package game.chessPiece;

import game.ChessBoard;
import game.Color;
import game.Coord;
import game.Piece;
import game.boardException.IllegalMove;
import game.boardException.IllegalPosition;

/**
 * A piece of chess : king
 */

public class King extends Piece {
    public ChessBoard board;
    public Color col;
    public Coord place;

    //Getter
    public Color getCol() {
        return col;
    }
    public Coord getPlace() {
        return place;
    }
    public ChessBoard getBoard() {
        return board;
    }

    /**
     *
     * @param place corresponds of the position's piece
     * @param col corresponds of tge color's piece
     * @param board corresponds of the board with de pieces
     */
    public King(Coord place, Color col, ChessBoard board) {
        this.place = place;
        this.col = col;
        this.board = board;
        this.board.setOccupation(this.place, true);
    }

    /**
     *
     * @param c corresponds to the new desired position.
     * @throws IllegalPosition except an exception when the piece is out of matrix
     * @throws IllegalMove except an exception when  the piece make a move out of this capacity.
     */
    public void move(Coord c) throws IllegalPosition, IllegalMove  {
        int dx = Math.abs(this.place.getX() - c.getX());
        int dy = Math.abs(this.place.getY() - c.getY());

        if((dx == 1 && dy == 0) || (dx == 0 && dy == 1) || (dx == 1 && dy == 1)){
            if (c.getX() < 8 && c.getX() >= 0 && c.getY() < 8 && c.getY() >= 0 && !getBoard().isOccupied(c)) {
                this.board.setOccupation(this.place,false);
                this.place = c;
                this.board.setOccupation(c, true);
            } else {
                throw new IllegalMove("Illegal move for the King");
            }
        } else {
            throw new IllegalPosition("The King is out of range");
        }
    }

    public String toString(){
        return board.toString();
    }
}
