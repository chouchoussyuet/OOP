import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    /**
     * Constructor.
     */
    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /**
     * Check valid. 
     * @param x this. 
     * @param y this. 
     * @return bool.
     */
    public boolean validate(int x, int y) {
        return x >= 1 && x <= WIDTH && y <= HEIGHT && y >= 1;
    }

    /**
     * Add Piece.
     * @param piece this. 
     */
    public void addPiece(Piece piece) {
        int tmp = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (piece.checkPosition(pieces.get(i))) {
                tmp++;
            }
        }
        if (tmp == 0) {
            pieces.add(piece);
        }
    }

    /**
     * Get At.
     * @param x this.
     * @param y this.
     * @return piece.
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x 
                && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }

        return null;
    }

    /**
     * Remove. 
     * 
     * @param x this. 
     * @param y this. 
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x 
                && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                break;
            }
        }
    }

    /**
     * Getter. 
     * 
     * @return list. 
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Setter. 
     * 
     * @param pieces list. 
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
