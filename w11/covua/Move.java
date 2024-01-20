public class Move {
    private Piece movedPiece;
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece killedPiece;

    /**
     * Constructor 5 m. 
     * 
     * @param startX this. 
     * @param endX this. 
     * @param startY this. 
     * @param endY this. 
     * @param movedPiece this. 
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Constructor 6 m.
     * @param startX this. 
     * @param endX this. 
     * @param startY this. 
     * @param endY this. 
     * @param movedPiece this. 
     * @param killedPiece this. 
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }
    

    /**
     * Getter. 
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Setter. 
     */
    public void setMovedPiece(Piece p) {
        movedPiece = p;
    }

    public void setStartX(int x) {
        startX = x;
    }

    public void setStartY(int y) {
        startY = y;
    }

    public void setEndX(int x) {
        endX = x;
    }

    public void setEndY(int y) {
        endY = y;
    }

    public void setKilledPiece(Piece p) {
        killedPiece = p;
    }

    /**
     * To String.
     */
    public String toString() {
        String res = this.movedPiece.getColor() + "-" 
                    + this.movedPiece.getSymbol() 
                    + (char) ('a' + (endX - 1)) + endY;

        return res;
    }
}
