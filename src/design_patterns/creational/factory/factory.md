# Factory Design Pattern in Java

The **Factory Pattern** is a **creational design pattern** that provides an interface for creating objects but allows subclasses or methods to alter the type of objects that will be created. It promotes **loose coupling** and adheres to the **Open/Closed Principle**.

---

## 🧠 Advantages

* 🛠 Encapsulates object creation logic.
* 🔄 Promotes code reusability and scalability.
* 🧩 Supports interface-based programming (decouples implementation from usage).
* 🧪 Easier to manage and extend complex object creation logic.

---

## 🔁 Implementation in Java

### Step 1: Create a common interface

```java
public interface Shape {
    void draw();
}
```

### Step 2: Create concrete implementations

```java
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
```

### Step 3: Create the Factory class

```java
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
```

### Step 4: Client usage

```java
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw();
    }
}
```

---

## 🌍 Real-world Use Cases

* 📦 UI components creation (buttons, windows).
* 🧩 Parsing frameworks (e.g., different file formats).
* ⚙️ Service provider APIs (e.g., JDBC DriverManager).
* 🔄 Business rule processors or validators.

---

## ⚠️ Drawbacks

* ❗ Might introduce too many small classes.
* 🧪 Can become complex if too many conditions or types are added in one factory.
* ⚠ Requires maintenance as new types are added.

---

## ✅ Best Practices

* Use **Factory Method** when object creation is complex or type varies.
* Keep factory logic **simple and focused**.
* Consider using **Abstract Factory** for families of related objects.
* Combine with **Dependency Injection** to inject factory output.

---

The Factory Pattern is one of the most widely used patterns in Java and is often used in conjunction with frameworks like Spring, where beans are often created using factories under the hood.
