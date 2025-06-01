package design_patterns.creational.prototype.solution;

import java.util.ArrayList;
import java.util.List;

public class Shape implements Cloneable{
    private String type;
    private String color;
    private List<String> tags; //mutable field

    public Shape(){
    }
    public Shape(String type, String color, List<String> tags) {
        this.type = type;
        this.color = color;
        this.tags = new ArrayList<>(tags); // defensive copy
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public List<String> getTags() {
        return new ArrayList<>(tags); // defensive copy
    }
    public void setTags(List<String> tags) {
        this.tags = new ArrayList<>(tags); // defensive copy
    }

    @Override
    public Shape clone() {
        try {
            Shape cloned = (Shape) super.clone();
            // Create a new list for tags to ensure deep copy
            cloned.tags = new ArrayList<>(this.tags);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
