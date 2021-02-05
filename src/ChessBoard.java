public class ChessBoard {
    private int[][] cases;

    public ChessBoard() {
        cases = new int[8][8];
    }

    public boolean isOccupied(Coord pos){
        if(cases[pos.getX()][pos.getY()] == 1){
            return true;
        }else{
            return false;
        }
    }
    public void setOccupation(Coord pos, boolean in){
        if (in == true) {
            cases[pos.getX()][pos.getY()] = 1;
        } else {
            cases[pos.getX()][pos.getY()] = 0;
        }
    }

    public void smartPrint(){
        System.out.println("");
        for(int i = 8; i>0; i--){ // évite l'inversion d'affichage
            System.out.print(i);
            for( int j = 0; j<8; j++){
                if(this.cases[i-1][j] == 1) {
                    System.out.print(" X ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        System.out.print("  1  2  3  4  5  6  7  8");

    }

}
