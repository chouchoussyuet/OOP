public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor mac dinh. 
     */
    public Shape() {
        color = "null";
        filled = false;
    }

    /**
     * Constructor 2 tham so.
     * 
     * @param color this.
     * @param filled this.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * Getter for color.
     * 
     * @return color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Setter for color. 
     * 
     * @param color this.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for filled. 
     * 
     * @return yes or no.
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * Setter for filled. 
     * 
     * @param filled this.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method.
     * @return dien tich hcn.
     */
    public abstract double getArea();

    /**
     * Abstract method.
     * @return chu vi hcn.
     */
    public abstract double getPerimeter();

    /**
     * To String. 
     */
    public String toString() {
        String s = "Shape[color=" + this.color
                    + ",filled="  + this.filled + "]";
        return s;
    }

    
}