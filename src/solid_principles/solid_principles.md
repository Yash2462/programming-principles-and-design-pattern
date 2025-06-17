# SOLID Principles in Java

**SOLID** is an acronym for five design principles intended to make software designs more understandable, flexible, and maintainable. These principles are foundational in object-oriented design and are widely applied in Java development.

---

## 🧱 1. Single Responsibility Principle (SRP)

> A class should have only one reason to change.

**Meaning:** Each class should only have one job or responsibility.

### ✅ Good Example:

```java
class Report {
    private String content;
    public String getContent() { return content; }
}

class ReportPrinter {
    public void print(Report report) {
        System.out.println(report.getContent());
    }
}
```

**Why it works:** `Report` handles data, `ReportPrinter` handles printing.

---

## 🧱 2. Open/Closed Principle (OCP)

> Software entities should be open for extension, but closed for modification.

**Meaning:** You should be able to extend a class’s behavior without modifying its source code.

### ✅ Good Example:

```java
interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    public double area() { return Math.PI * radius * radius; }
}

class AreaCalculator {
    public double calculate(Shape shape) {
        return shape.area();
    }
}
```

**Why it works:** You can add new shapes without changing `AreaCalculator`.

---

## 🧱 3. Liskov Substitution Principle (LSP)

> Subtypes must be substitutable for their base types.

**Meaning:** Objects of a superclass should be replaceable with objects of its subclasses without affecting correctness.

### ✅ Good Example:

```java
class Bird {
    public void fly() { System.out.println("Flying"); }
}

class Sparrow extends Bird {}
```

### ❌ Bad Example:

```java
class Ostrich extends Bird {
    @Override
    public void fly() { throw new UnsupportedOperationException(); }
}
```

**Fix:** Refactor using interfaces to separate flyable behavior.

---

## 🧱 4. Interface Segregation Principle (ISP)

> Clients should not be forced to depend on interfaces they do not use.

**Meaning:** Use multiple small, specific interfaces instead of a large, general-purpose one.

### ✅ Good Example:

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() { System.out.println("Printing"); }
}
```

**Why it works:** Classes only implement what they need.

---

## 🧱 5. Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

**Meaning:** Use interfaces or abstract classes to decouple high-level and low-level modules.

### ✅ Good Example:

```java
interface Keyboard {
    String readInput();
}

class WiredKeyboard implements Keyboard {
    public String readInput() { return "typing"; }
}

class Computer {
    private final Keyboard keyboard;
    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    public void read() {
        System.out.println(keyboard.readInput());
    }
}
```

**Why it works:** `Computer` depends on an abstraction (`Keyboard`), not a concrete implementation.

---

## ✅ Summary of SOLID

| Principle | Goal                                         |
| --------- | -------------------------------------------- |
| SRP       | One reason to change                         |
| OCP       | Open to extension, closed to modification    |
| LSP       | Subclasses should be substitutable           |
| ISP       | Prefer small, specific interfaces            |
| DIP       | Depend on abstractions, not concrete classes |

Adhering to SOLID principles leads to clean, testable, and maintainable codebases in Java.
