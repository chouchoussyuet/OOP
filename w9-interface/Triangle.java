public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor. 
     * 
     * @param p1 this. 
     * @param p2 this.
     * @param p3 this.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double x1 = p1.getPointX();
        double x2 = p2.getPointX();
        double x3 = p3.getPointX();

        double y1 = p1.getPointY();
        double y2 = p2.getPointY();
        double y3 = p3.getPointY();

        if (p1.equals(p2) || p2.equals(p3) || p1.equals(p3)) {
            throw new RuntimeException("Invalid");
        } else if ((x3 - x2) * (y1 - y2) - (x1 - x2) * (y3 - y2) == 0) {
            throw new RuntimeException("Invalid");
        } else {
            this.p1 = p1; 
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /**
     * Getter p1.
     * 
     * @return Point.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Getter p2.
     * 
     * @return Point.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Getter p3. 
     * 
     * @return Point.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * Get perimeter. 
     */
    public double getPerimeter() {
        double c1 = p1.distance(p2);
        double c2 = p1.distance(p3);
        double c3 = p2.distance(p3);

        return c1 + c2 + c3;
    }

    /**
     * Get area. 
     */
    public double getArea() {
        double c1 = p1.distance(p2);
        double c2 = p1.distance(p3);
        double c3 = p2.distance(p3);

        double p = (c1 + c2 + c3) / 2;

        double s = Math.sqrt(p * (p - c1) * (p - c2) * (p - c3));

        return s;
    }

    /**
     * Get Info. 
     */
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                            p1.getPointX(), p1.getPointY(), 
                            p2.getPointX(), p2.getPointY(), 
                            p3.getPointX(), p3.getPointY());
    }
}
