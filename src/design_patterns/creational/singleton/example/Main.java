package design_patterns.creational.singleton.example;

public class Main {
    public static void main(String[] args) {
        // Create a singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use the singleton instance
        singleton.showMessage();

        // Verify that the same instance is returned
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherSingleton));
    }
}
