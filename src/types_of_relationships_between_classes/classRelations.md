# Types of Relationships Between Classes in Java

Understanding relationships between classes is essential in object-oriented programming (OOP). Java supports several key types of relationships, each representing different ways that classes can work together.

---

## 🧩 1. Association

> A relationship where all objects have their own lifecycle and there is no ownership.

### 🔹 Example:

```java
class Person {
    private String name;
}

class Company {
    private List<Person> employees;
}
```

**Explanation:** A `Company` has `Person` objects, but a `Person` can exist independently of a `Company`.

---

## 🤝 2. Aggregation

> A specialized form of Association with a "whole-part" relationship. The child can exist independently of the parent.

### 🔹 Example:

```java
class Department {
    private String name;
}

class University {
    private List<Department> departments;
}
```

**Explanation:** A `University` aggregates `Departments`, but departments can exist without the university.

---

## 🔗 3. Composition

> A strong form of Aggregation where the child cannot exist independently of the parent.

### 🔹 Example:

```java
class Engine {
    private String type;
}

class Car {
    private final Engine engine = new Engine();
}
```

**Explanation:** If the `Car` is destroyed, its `Engine` is also destroyed.

---

## 👑 4. Inheritance (Is-a Relationship)

> A relationship where one class (child) inherits the properties and behavior of another (parent).

### 🔹 Example:

```java
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}
```

**Explanation:** `Dog` is an `Animal` — it inherits its methods.

---

## 🧰 5. Realization (Interface Implementation)

> A class implements an interface, promising to provide the behavior defined in it.

### 🔹 Example:

```java
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() { System.out.println("Drawing Circle"); }
}
```

**Explanation:** `Circle` realizes the `Drawable` interface.

---

## 📌 Summary Table

| Relationship | Description             | Object Lifecycle        |
| ------------ | ----------------------- | ----------------------- |
| Association  | Uses another class      | Independent             |
| Aggregation  | Has-a, weak ownership   | Child can exist alone   |
| Composition  | Has-a, strong ownership | Child can't exist alone |
| Inheritance  | Is-a                    | Subclass extends base   |
| Realization  | Implements an interface | Implementation required |

---

Understanding these relationships helps in designing robust and maintainable object-oriented systems in Java.
