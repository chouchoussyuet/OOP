public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;
    
    /**
     * Constructor mặc định. 
     */
    public Circle() {
    }

    /**
     * Constructor 1 tham số. 
     * 
     * @param radius : ban kinh.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor 2 tham số. 
     * 
     * @param radius : ban kinh.
     * @param color : mau.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter radius. 
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Getter color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Setter radius.
     * 
     * @param radius : ban kinh.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Setter color.
     * 
     * @param color : mau.
     */
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = this.radius * this.radius * PI;
        return area;
    }

    public String toString() {
        String s = "Circle[radius=" + radius + ",color=" + color + "]";
        return s;
    }
}