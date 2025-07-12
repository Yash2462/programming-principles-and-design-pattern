# 🧠 Strategy Design Pattern in Java

---

## 🔍 Problem Statement

Imagine you're building an **e-commerce application** that needs to calculate **shipping costs** using different strategies:

- **Standard Shipping**
- **Express Shipping**
- **Overnight Shipping**

You start with code like:

```java
public class ShippingService {
    public double calculateShipping(String type, double weight) {
        if (type.equals("standard")) {
            return weight * 1.0;
        } else if (type.equals("express")) {
            return weight * 1.5;
        } else if (type.equals("overnight")) {
            return weight * 2.5;
        }
        return 0;
    }
}
```

### ❌ Problems with This Approach:

- Violates the **Open/Closed Principle** (OCP) — adding a new strategy requires modifying the class.
- **Hard to maintain and extend** — too many `if-else` conditions.
- **Tightly coupled** logic — the method both decides and executes the algorithm.
- **Poor testability** — cannot test strategies independently.

---

## ✅ Solution: Strategy Design Pattern

The **Strategy Pattern** enables selecting an algorithm at runtime by encapsulating each algorithm in a class. It:

- Defines a family of algorithms (strategies).
- Encapsulates each one.
- Makes them interchangeable within the context.

---

## 🏗️ Structure

- `Strategy` – Interface defining the algorithm.
- `ConcreteStrategy` – Implements the algorithm.
- `Context` – Uses the Strategy to execute the behavior.

---

## ✅ Java Implementation

### 1. Strategy Interface

```java
public interface ShippingStrategy {
    double calculate(double weight);
}
```

---

### 2. Concrete Strategy Classes

```java
public class StandardShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 1.0;
    }
}

public class ExpressShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 1.5;
    }
}

public class OvernightShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 2.5;
    }
}
```

---

### 3. Context Class

```java
public class ShippingService {
    private ShippingStrategy strategy;

    public ShippingService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShipping(double weight) {
        return strategy.calculate(weight);
    }
}
```

---

### 4. Client Code Example

```java
public class Main {
    public static void main(String[] args) {
        ShippingService service = new ShippingService(new StandardShipping());
        System.out.println("Standard: " + service.calculateShipping(10));

        service.setStrategy(new ExpressShipping());
        System.out.println("Express: " + service.calculateShipping(10));

        service.setStrategy(new OvernightShipping());
        System.out.println("Overnight: " + service.calculateShipping(10));
    }
}
```

### ✅ Output

```
Standard: 10.0
Express: 15.0
Overnight: 25.0
```

---

## 🎯 Benefits

- ✅ **Open/Closed Principle**: Add new strategies without changing existing code.
- ✅ **Single Responsibility Principle**: Each class has one job.
- ✅ **Easily Testable**: Each strategy is isolated and testable.
- ✅ **Runtime Flexibility**: Strategy can be changed at runtime.

---

## 💡 When to Use Strategy Pattern

- You have multiple ways to perform a specific task.
- You want to select an algorithm dynamically at runtime.
- You want to avoid a large block of `if-else` or `switch-case`.
- You want to encapsulate related behaviors for reuse.

---

## 🔁 Optional: Using Java 8+ Lambdas

You can simplify strategy definitions using lambdas:

```java
ShippingService service = new ShippingService(weight -> weight * 1.0);
```

Where `ShippingStrategy` is a functional interface.

---

## 📌 Summary

| Aspect       | Traditional Approach       | Strategy Pattern        |
|--------------|----------------------------|--------------------------|
| Flexibility  | Low                        | High                     |
| Testability  | Low                        | High                     |
| Maintenance | Hard (edit method)         | Easy (add new class)     |
| OCP          | Violated                   | Respected                |

---