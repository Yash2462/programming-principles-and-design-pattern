package design_patterns.creational.prototype.solution;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.setType("Circle");
        shape1.setColor("Red");

        // Clone shape1 to create shape2
        // this is also known as shallow copy
        Shape shape2 = shape1.clone();

        System.out.println("Shape 1: " + shape1.getType() + ", Color: " + shape1.getColor());
        System.out.println("Shape 2: " + shape2.getType() + ", Color: " + shape2.getColor());
    }
}
