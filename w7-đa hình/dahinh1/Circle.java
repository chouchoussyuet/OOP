public class Circle extends Shape {
    protected double radius;

    /**
     * Constructor mac dinh. 
     */
    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Constructor 2.
     * 
     * @param radius this.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor day du.
     * 
     * @param radius this.
     * @param color this.
     * @param filled this.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter for radius.
     * 
     * @return radius.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter for radius.
     * 
     * @param radius this.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Override abstract method.
     */
    @Override 
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    /**
     * Override abstract method.
     */
    @Override 
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    /**
     * To String. 
     */
    @Override 
    public String toString() {
        String s = "Circle[radius=" + this.radius 
                    + ",color=" + this.getColor()
                    + ",filled="  + this.isFilled() + "]";
        return s;
    }
}
