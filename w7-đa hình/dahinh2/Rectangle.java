import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Constructor mac dinh. 
     */
    public Rectangle() {
        super();
        this.width = 0; 
        this.length = 0;
    }
    
    /**
     * Constructor 2 tham so.
     * 
     * @param width this.
     * @param length this.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor day du.
     *  
     * @param width this.
     * @param length this.
     * @param color this.
     * @param filled this.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor. 
     * 
     * @param topLeft this.
     * @param width this.
     * @param length this.
     * @param color this.
     * @param filled this.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Getter for topleft.
     * 
     * @return point.
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * Setter for topleft.
     * 
     * @param topLeft this.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Getter for width. 
     * 
     * @return width. 
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Setter for width.
     * 
     * @param width this.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Getter for length.
     * 
     * @return length.
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Setter for length.
     * 
     * @param length this.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Override abstract method. 
     */
    @Override 
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * Override abstract method. 
     */
    @Override 
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    /**
     * To String. 
     */
    @Override 
    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
        topLeft, width, length, color, filled);
    }

    /**
     * Override equals methods. 
     */
    @Override 
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            return (this.width == r.width 
                && this.length == r.length 
                && this.topLeft.equals(r.topLeft));
        }
        return false;
    }

    /**
     * Override hashCode methods. 
     */
    @Override 
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }
}
