package solid_principles.open_closed.problem;

// Problematic ShapeAreaCalculator.java
public class ShapeAreaCalculator {

    public double area(Shape shape) {
        double areaOfShape=0.0f;
        if (shape instanceof Square) {
            // calculate the area of Square
        } else if (shape instanceof Circle) {
            // calculate the area of Circle
        }
        return areaOfShape;
    }

}
// More shapes will require additional methods...
/*
Issues with this code:

1. Modification is Required for New Shapes:
   Every time you add a new shape, you need to modify the ShapeAreaCalculator class to introduce a new method (calculateTriangleArea, calculateSquareArea, etc.). This means you are modifying the existing code whenever new requirements come in.

2. Violation of Open/Closed Principle:
   The ShapeAreaCalculator class is not closed for modification. Whenever you add a new shape, you're forced to change the existing code.

3. Code Duplication:
   Each new shape requires a new method, which leads to duplication in your code. More shape types would add more methods, which becomes harder to manage.

4. Tight Coupling:
   The ShapeAreaCalculator class is tightly coupled to the specific types of shapes it supports. If you want to extend the system with new shapes, you must modify ShapeAreaCalculator, which can introduce bugs or unintended side effects.
*/

