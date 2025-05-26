package solid_principles.liskov_substitution.problem;

public class Bird {
    public void fly() {}
}

//in this example, the Bird class has a fly method that does nothing. The Duck class extends the Bird class and has a quack method.
// The Ostrich class extends the Bird class and has a fly method that throws an exception. The Duck class is a good example of the Liskov Substitution Principle because it extends the Bird class and adds a new behavior (quack) without changing the existing behavior (fly). The Ostrich class, on the other hand, is not a good example of the Liskov Substitution Principle because it changes the behavior of the fly method by throwing an exception.
// This violates the Liskov Substitution Principle because it changes the behavior of the superclass method.

//Note : if it looks like duck quake likes duck but needs batteries then you probably have the wrong abstraction.