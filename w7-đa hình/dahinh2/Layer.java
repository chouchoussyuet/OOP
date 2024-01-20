import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * Constructor.
     */
    public Layer() {
        this.shapes = new java.util.ArrayList<>();
    }

    /**
     * Add.
     * 
     * @param shape this.
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Remove cirlce.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /**
     * Get info all.
     * 
     * @return info of shapes.
     */
    public String getInfo() {
        String s = "Layer of crazy shapes:\n";
        for (Shape shape : this.shapes) {
            s += shape.toString() + "\n";
        }
        return s;
    }

    /**
     * Remove trung. 
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }
}
