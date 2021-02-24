package game;

/**
 * Coord
 * @author Morgann Riu
 */
public class Coord {

    /**
     * x Coord
     */
    private int x;

    /**
     * y Coord
     */
    private int y;

    /**
     *
     * @param x represent the x value coordinate in matrix
     * @param y represent the y value coordinate in matrix
     */

    public Coord(int x, int y) {
        this.x = x - 1;
        this.y = y - 1;
    }

    /**
     *
     * @return  x represent the y value coordinate in matrix
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return  y represent the y value coordinate in matrix
     */
    public int getY() {
        return y;
    }
}
