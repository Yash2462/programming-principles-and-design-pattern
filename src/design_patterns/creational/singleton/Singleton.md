# Singleton Pattern in Java

The **Singleton Pattern** ensures a class has only one instance and provides a global point of access to it. It is a **creational design pattern** commonly used when exactly one object is needed to coordinate actions across the system.

---

## 🧠 Advantages

* ✅ Ensures only one instance of the class exists throughout the application.
* 🌐 Provides a global access point to that instance.
* 🔄 Useful for shared resources like configuration settings, logging, or thread pools.
* 📉 Can help reduce memory footprint for stateless or shared logic.

---

## 🔁 Variations of Singleton in Java

### 1. Eager Initialization

Instance is created at the time of class loading.

```java
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

✅ Simple and thread-safe without synchronization.

❌ Instance is created even if it might not be used.

---

### 2. Lazy Initialization

Instance is created only when needed (on first access).

```java
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```

❌ Not thread-safe.

---

### 3. Thread-safe Singleton (Synchronized Method)

```java
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
```

✅ Thread-safe.

❌ Slower due to synchronized method on every call.

---

### 4. Double-Checked Locking (Efficient Thread-safe Singleton)

```java
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
```

✅ Efficient and thread-safe.

---

### 5. Enum Singleton (Best Practice)

```java
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something...");
    }
}
```

✅ Thread-safe, serialization-safe, and protects against reflection.

---

## 🌍 Real-world Use Cases

* 🦵 Logging services (e.g., `Logger.getInstance().log()`).
* ⚙️ Configuration or settings managers.
* 🌐 Connection pools (e.g., JDBC connection pool).
* 📦 Caches and registries.

---

## ⚠️ Drawbacks

* ❗ Global access can lead to **hidden dependencies** and **tighter coupling**.
* 🔍 Makes **unit testing difficult** due to shared state.
* 🚫 Not suitable when **multiple instances** are needed (e.g., multi-tenant applications).
* 💥 Improper implementation can cause **concurrency issues** in multi-threaded environments.

---

## ✅ Best Practices

* Prefer `Enum` Singleton for simple singletons.
* Use **double-checked locking** for performance-critical multi-threaded applications.
* Keep the constructor `private`.
* Avoid exposing the singleton instance to modification.
