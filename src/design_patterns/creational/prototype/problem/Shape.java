package design_patterns.creational.prototype.problem;

public class Shape {
    private String type;
    private String color;

    public Shape() {
    }

    // This method is not suitable for cloning
    public Shape cloneShape() {
        return new Shape(this.type, this.color);
    }
    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
