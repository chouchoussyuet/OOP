public class Bishop extends Piece {

    /**
     * Constructor. 
     * 
     * @param coordinatesX this. 
     * @param coordinatesY this.
     */
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor. 
     * 
     * @param coordinatesX this. 
     * @param coordinatesY this. 
     * @param color this. 
     */
    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Symbol.
     */
    public String getSymbol() {
        return "B";
    }

    /**
     * Boolean. 
     */
    public boolean canMove(Board board, int x, int y) {

        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }

        // Check if the destination square is occupied by a piece of the same color
        if (board.getAt(x, y) != null 
            && board.getAt(x, y).getColor().equals(this.getColor())) {
            return false;
        }

        if (Math.abs(x - this.getCoordinatesX()) == Math.abs(y - this.getCoordinatesY())) {
            int deltaX = x > this.getCoordinatesX() ? 1 : -1;
            int deltaY = y > this.getCoordinatesY() ? 1 : -1;
            int i = this.getCoordinatesX() + deltaX;
            int j = this.getCoordinatesY() + deltaY;
    
            while (i != x && j != y) {
                if (board.getAt(i, j) != null) {
                    return false;
                }
                i += deltaX;
                j += deltaY;
            }
            return true;
        }
        
        return false;
    }
}
