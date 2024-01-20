public class Rectangle extends Shape {
    protected double width;
    protected double length;

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
        String s = "Rectangle[width=" + this.width
                    + ",length=" + this.length  
                    + ",color=" + this.getColor()
                    + ",filled="  + this.isFilled() + "]";
        return s;
    }

}
