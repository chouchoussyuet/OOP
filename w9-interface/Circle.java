public class Circle implements GeometricObject {

    public static final double PI = 3.14;

    private Point center;
    private double radius;

    /**
     * Constructor.
     * 
     * @param center this.
     * @param radius this.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getter for center. 
     * 
     * @return Point.
     */
    public Point getCenter() {
        return center;
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
        return radius;
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
     * Caculate area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Calculate perimeter. 
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Get format info for circle. 
     */
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]", 
                            center.getPointX(), center.getPointY(), radius);
    }
}
