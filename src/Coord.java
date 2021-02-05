public class Coord {
    private int x;
    private int y;

    public Coord(int x, int y) {
        this.x = x - 1;
        this.y = y - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
