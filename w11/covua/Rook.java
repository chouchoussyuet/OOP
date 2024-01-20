public class Rook extends Piece {

    /**
     * Constructor 2. 
     * 
     * @param coordinatesX cha.
     * @param coordinatesY cha.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor 3. 
     * 
     * @param coordinatesX cha. 
     * @param coordinatesY cha. 
     * @param color cha.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Get symbol.
     */
    public String getSymbol() {
        return "R";
    }

    /**
     * Boolean. 
     * @param board this.
     * @param x this. 
     * @param y this. 
     * @return bool.
     */
    public boolean canMove(Board board, int x, int y) {

        if (this.getCoordinatesX() == x) {

            if (y > this.getCoordinatesY()) {
                // check duong di khong co chuong ngai vat
                for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        return false; // co quan tren duong di.
                    }
                }
                // check tai diem cuoi
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false; // cung mau. 
                    } else {
                        return true; // khac mau. 
                    }
                } else { 
                    return true; // tai diem cuoi khong co quan.
                }

            } else {
                for (int i = y + 1; i < this.getCoordinatesY(); i++) {
                    if (board.getAt(x, i) != null) {
                        return false; // co quan tren duong di. 
                    }
                }
                //check tai diem cuoi 
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false; // cung mau. 
                    } else {
                        return true; // khac mau. 
                    }
                } else { 
                    return true; // tai diem cuoi khong co quan.
                }
            }

        } else if (this.getCoordinatesY() == y) {
            if (x > this.getCoordinatesX()) {
                // check duong di khong co chuong ngai vat
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false; // co quan tren duong di.
                    }
                }
                // check tai diem cuoi
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false; // cung mau. 
                    } else {
                        return true; // khac mau. 
                    }
                } else { 
                    return true; // tai diem cuoi khong co quan.
                }

            } else {
                for (int i = x + 1; i < this.getCoordinatesX(); i++) {
                    if (board.getAt(i, y) != null) {
                        return false; // co quan tren duong di. 
                    }
                }
                //check tai diem cuoi 
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false; // cung mau. 
                    } else {
                        return true; // khac mau. 
                    }
                } else { 
                    return true; // tai diem cuoi khong co quan.
                }
            }

        } else {
            return false;
        }
    }

}
