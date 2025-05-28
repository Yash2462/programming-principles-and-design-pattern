package design_patterns.creational.builder.solution;
/**
 * The Builder pattern is used to construct complex objects step by step.
 * It allows for more readable and maintainable code, especially when dealing with many optional parameters.
 * This example demonstrates how to use the Builder pattern to create a User object.
 */
public class User {
    private String name;
    private int age;
    private String email;
    private String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;
        private String address;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
