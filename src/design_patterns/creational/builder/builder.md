# Builder Design Pattern in Java

The **Builder Pattern** is a **creational design pattern** used to construct complex objects step-by-step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

---

## 🧠 Advantages

* 🧱 Builds complex objects step-by-step.
* 🚫 Avoids telescoping constructors (constructors with too many parameters).
* ✅ Improves code readability and maintainability.
* 🔄 Supports immutability and fluent APIs.

---

## 🔁 Implementation in Java

### 1. Basic Builder Example

```java
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;

        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age + ", Phone: " + phone + ", Address: " + address;
    }
}
```

### 2. Client Usage

```java
public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .age(30)
                .phone("1234567890")
                .address("123 Main St")
                .build();

        System.out.println(user);
    }
}
```

---

## 🌍 Real-world Use Cases

* 📄 Generating complex documents or reports.
* 🍔 Constructing UI components or widgets.
* 🏗 Building objects with many optional parameters (e.g., database connections, HTTP requests).
* 🧱 Fluent APIs (e.g., StringBuilder, Java Streams).

---

## ⚠️ Drawbacks

* 🔧 May add complexity if the object is simple.
* 🔄 Requires creating additional builder classes.
* 🧩 Not suitable for enforcing mandatory field initialization unless explicitly handled.

---

## ✅ Best Practices

* Use Builder when an object has many optional parameters.
* Combine with **immutability** for thread-safe design.
* Follow fluent interface conventions (`return this`) for method chaining.
* Avoid exposing the builder internals directly.

---

The Builder Pattern is especially useful in modern Java development and is often seen in frameworks and libraries to simplify object creation with many parameters or conditional configurations.
