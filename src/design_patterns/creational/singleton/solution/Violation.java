package design_patterns.creational.singleton.solution;

import java.lang.reflect.Constructor;

public class Violation {
    public static void main(String[] args) throws Exception {
        // Normal way: get singleton instance
        Singleton instance1 = Singleton.getInstance();

        // Violation: use reflection to create another instance
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = constructor.newInstance();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
