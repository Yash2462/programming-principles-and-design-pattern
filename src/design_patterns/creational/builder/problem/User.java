package design_patterns.creational.builder.problem;

//    When a class has many optional parameters, using constructors becomes confusing and error-prone (telescoping constructor problem
public class User {
    private String name;
    private int age;
    private String email;
    private String address;

    public User(String name) {
        this(name, 0, null, null);
    }
    public User(String name, int age) {
        this(name, age, null, null);
    }
    public User(String name, int age, String email) {
        this(name, age, email, null);
    }
    public User(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }
}
