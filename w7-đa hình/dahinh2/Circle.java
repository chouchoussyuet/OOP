import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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
     * Constructor them point.
     * 
     * @param center this.
     * @param radius this.
     * @param color this.
     * @param filled this.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getter for center.
     * 
     * @return point.
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Setter for center. 
     * 
     * @param center this.
     */
    public void setCenter(Point center) {
        this.center = center;
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
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]", 
        center, radius, color, filled);
    }

    /**
     * Overrdie equals methods.
     */
    @Override 
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return (this.center.equals(c.center) 
                    && this.radius == c.radius);
        }
        return false;
    }

    /**
     * Override hashCode methods. 
     */
    @Override 
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
