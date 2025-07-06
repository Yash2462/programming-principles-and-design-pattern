
# 🧭 Observer Design Pattern in Java

## 📌 Problem

You are building a **news publishing system**. Whenever a **new article** is published, you want to notify all registered subscribers through different channels:

- Email
- SMS
- Mobile Push Notifications

### 🛑 Naive Approach

Hardcoding all notification logic inside the publisher class:

```java
public class NewsPublisher {
    public void publishArticle(String article) {
        System.out.println("Article Published: " + article);
        sendEmail(article);
        sendSMS(article);
        sendPushNotification(article);
    }

    private void sendEmail(String article) { /* logic */ }
    private void sendSMS(String article) { /* logic */ }
    private void sendPushNotification(String article) { /* logic */ }
}
```

#### ❌ Issues

- Publisher is **tightly coupled** with subscriber logic.
- **Violates Open/Closed Principle**: can't extend without modifying.
- Difficult to test or reuse independently.

---

## ✅ Solution – Observer Pattern

The **Observer Pattern** allows an object (Subject) to notify a list of dependents (Observers) whenever its state changes, without being tightly coupled to them.

---

## 🧱 Pattern Structure

- **Subject**: Maintains a list of observers and provides methods to attach/detach them.
- **Observer**: Defines an update interface for receiving notifications.
- **ConcreteSubject**: Stores state and notifies observers.
- **ConcreteObserver**: Implements the update behavior.

---

## 💻 Java Implementation

### 1. `Observer` Interface

```java
public interface Observer {
    void update(String article);
}
```

### 2. `Subject` Interface

```java
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String article);
}
```

### 3. `NewsPublisher` (ConcreteSubject)

```java
import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String article) {
        for (Observer observer : observers) {
            observer.update(article);
        }
    }

    public void publishArticle(String article) {
        System.out.println("Publishing article: " + article);
        notifyObservers(article);
    }
}
```

### 4. `EmailSubscriber` (ConcreteObserver)

```java
public class EmailSubscriber implements Observer {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String article) {
        System.out.println("Email sent to " + email + ": " + article);
    }
}
```

### 5. `SMSSubscriber` (ConcreteObserver)

```java
public class SMSSubscriber implements Observer {
    private final String phone;

    public SMSSubscriber(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String article) {
        System.out.println("SMS sent to " + phone + ": " + article);
    }
}
```

### 6. `Main` Class – Demo

```java
public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer email = new EmailSubscriber("user@example.com");
        Observer sms = new SMSSubscriber("+911234567890");

        publisher.registerObserver(email);
        publisher.registerObserver(sms);

        publisher.publishArticle("Java 21 Released!");
    }
}
```

---

## 🎯 Benefits

- Promotes **loose coupling** between publisher and subscribers.
- Follows **Open/Closed Principle** – easy to add new observers.
- Promotes **reusability** and **scalability**.

---

## 📎 When to Use

- When multiple objects need to be notified of a change in another object.
- To avoid tight coupling between objects that interact.

---

## 🧠 Summary

The Observer Pattern is a powerful way to decouple publishers and subscribers. It makes your system **extensible**, **flexible**, and **easy to maintain**.

---
