public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor 1.
     * 
     * @param pointX this.
     * @param pointY this.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getter for x.
     * 
     * @return x.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Getter for y.
     * @return y.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Setter for x.
     * 
     * @param pointX this.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Setter for Y. 
     * @param pointY this.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Distance betwween 2 point. 
     * 
     * @param other new point.
     * @return distsnce.
     */
    public double distance(Point other) {
        double dx = Math.pow(other.getPointX() - this.pointX, 2);
        double dy = Math.pow(other.getPointY() - this.pointY, 2);
        return Math.sqrt(dx + dy);
    }  
    
    public boolean equals(Point other) {
        return this.pointX == other.pointX && this.pointY == other.pointY;
    }

}
