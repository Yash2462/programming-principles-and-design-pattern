package design_patterns.creational.builder.solution;

public class Main {
    public static void main(String[] args) {
        // Usage is clear and readable
        User user = new User.Builder("Alice")
                .age(25)
                .email("")
                .build();
    }
}
