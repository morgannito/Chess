public class IllegalMove extends Exception {
    private Coord illegalCoord;

    public IllegalMove() { this.illegalCoord = illegalCoord;}

    public Coord getIllegalCoord() {
        return illegalCoord;
    }

}
