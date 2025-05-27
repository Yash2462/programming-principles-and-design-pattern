package design_patterns.creational.singleton.example;

public class Singleton {
    // private static variable to hold the single instance
    private static volatile Singleton instance;

    // private constructor to prevent instantiation
    private Singleton() {
    }

    // public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
