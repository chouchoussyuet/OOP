import java.util.List;

public class ShapeUtil {
    /**
     * Print list of shapes.
     * 
     * @param shapes list of shapes.
     * @return result is string. 
     */
    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        for (GeometricObject s : shapes) {
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                result += c.getInfo() + "\n";
            }
        }

        result += "Triangle:\n";
        for (GeometricObject s : shapes) {
            if (s instanceof Triangle) {
                Triangle t = (Triangle) s;
                result += t.getInfo() + "\n";
            }
        }

        return result;
    }
}
