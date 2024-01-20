public class Cylinder extends Circle {
    private double height;
    
    /**
     * Constructor mặc định.
     */
    public Cylinder() {
        super();
    }

    /**
     * Constructor 2. 
     * 
     * @param radius : r.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Constructor 3. 
     * 
     * @param radius : r. 
     * @param height : h.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor 4.
     * 
     * @param radius : r.
     * @param height : h.
     * @param color : color.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter.
     * 
     * @return height.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Setter.
     * 
     * @param height : h.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Volume.
     * 
     * @return v.
     */
    public double getVolume() {
        return this.getArea() * this.height;
    }

    /**
     * To String. 
     */
    @Override
    public String toString() {
        String s = "Cylinder[Circle[radius=" + this.getRadius() 
                    + ",color=" + this.getColor()
                    + "],height=" + this.height + "]";
        return s;
    }

    /**
     * Get area. 
     */
    @Override 
    public double getArea() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }

}