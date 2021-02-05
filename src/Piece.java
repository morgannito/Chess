public abstract class Piece {
    protected ChessBoard board;
    protected Coord place;
    protected Color col;

    //Getter
    public Coord getPlace() { return place; }
    public ChessBoard getBoard() { return board; }
    public Color getCol() { return col; }

    //Setter
    public void setBoard(ChessBoard board) { this.board = board; }
    public void setPlace(Coord place) { this.place = place; }
    public void setCol(Color col) { this.col = col; }

    abstract void move(Coord c) throws IllegalPosition, IllegalMove;
}

