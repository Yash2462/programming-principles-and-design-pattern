package design_patterns.creational.prototype.problem;

public class Main {
    public static void main(String[] args) {
        // Bad: Creating new objects manually, copying fields
        Shape shape1 = new Shape();
        shape1.setType("Circle");
        shape1.setColor("Red");

        Shape shape2 = new Shape();
        shape2.setType(shape1.getType());
        shape2.setColor(shape1.getColor());

        // Tedious and error-prone to copy fields manually
        // How to handle if fields are added or changed?
        System.out.println("shape 1 type: " + shape1.getType() + ", color: " + shape1.getColor());
        System.out.println("shape 2 type: " + shape2.getType() + ", color: " + shape2.getColor());
    }
}
