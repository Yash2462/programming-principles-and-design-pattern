package types_of_relationships_between_classes.Association;

//Association is a relationship where one class uses another class, but they can exist independently.
// Student and Course are associated, but they can exist independently.
public class Student {
    private String name;
    private int age;
    private Course course; //Student is associated with Course

    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Course getCourse() {
        return course;
    }

}
