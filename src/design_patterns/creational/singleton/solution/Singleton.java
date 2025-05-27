package design_patterns.creational.singleton.solution;

public class Singleton {
    private static volatile Singleton instance;
    private static boolean instanceCreated = false;

    private Singleton() {
        if (instanceCreated) {
            System.out.println("Singleton instance already created. Use getInstance() method.");
        }
        instanceCreated = true;
    }

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
