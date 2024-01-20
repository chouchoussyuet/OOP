import java.util.Objects;

public class Square extends Rectangle {
    /**
     * Constructor mac dinh.
     */
    public Square() {
        super();
    }

    /**
     * Constructor 1.
     * 
     * @param side this.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor 2. 
     * 
     * @param side this.
     * @param color this.
     * @param filled this.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor day du. 
     * 
     * @param topLeft this.
     * @param side this.
     * @param color this.
     * @param filled this.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Getter side.
     * 
     * @return side.
     */
    public double getSide() {
        return getWidth();
    }

    /**
     * Setter sided. 
     * 
     * @param side new.
     */
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    /**
     * Override width.
     */
    @Override 
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Override length.
     */
    @Override 
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * To String. 
     */
    @Override 
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%b]", 
        getTopLeft(), getSide(), getColor(), isFilled());
    }

    
    /**
     * Override equals methods. 
     */
    @Override 
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square s = (Square) o;
            return super.equals(o) && getSide() == s.getSide();
        }
        return false;
    }

}
