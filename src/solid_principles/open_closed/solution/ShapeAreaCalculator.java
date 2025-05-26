package solid_principles.open_closed.solution;

import java.util.List;

public class ShapeAreaCalculator {
    public double totalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
