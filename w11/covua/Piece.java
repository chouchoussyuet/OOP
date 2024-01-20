public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor 2. 
     * 
     * @param coordinatesX this. 
     * @param coordinatesY this. 
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * Constructor. 
     * 
     * @param coordinatesX this. 
     * @param coordinatesY this.
     * @param color this.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * Getter. 
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public String getColor() {
        return this.color;
    }

    /**
     * Setter. 
     */
    public void setCoordinatesX(int x) {
        coordinatesX = x;
    }

    public void setCoordinatesY(int y) {
        coordinatesY = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Check compare position. 
     * 
     * @param p other. 
     * @return boolean. 
     */
    public boolean checkPosition(Piece p) {
        return this.coordinatesX == p.getCoordinatesX() 
                && this.coordinatesY == p.getCoordinatesY();
    }

}