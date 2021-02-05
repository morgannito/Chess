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

    //Setter
    public void setBoard(ChessBoard board) { this.board = board; }
    public void setPlace(Coord place) {
        this.place = place;
    }
    public void setCol(Color col) {
        this.col = col;
    }

    // Constructor
    public King(Coord place, Color col, ChessBoard board) {
        this.place = place;
        this.col = col;
        this.board = board;

        this.board.setOccupation(this.place, true);
    }

    public void move(Coord c) throws IllegalPosition, IllegalMove  {
        int dx = Math.abs(this.place.getX() - c.getX());
        int dy = Math.abs(this.place.getY() - c.getY());

        if((dx == 1 && dy == 0) || (dx == 0 && dy == 1) || (dx == 1 && dy == 1)){
            if (c.getX() < 8 && c.getX() >= 0 && c.getY() < 8 && c.getY() >= 0 && !getBoard().isOccupied(c)) {
                this.board.setOccupation(this.place,false);
                this.place = c;
                this.board.setOccupation(c, true);
            } else {
                throw new IllegalPosition();
            }
        } else {
            throw new IllegalMove();
        }
    }

    public String toString(){
        return board.toString();
    }
}
