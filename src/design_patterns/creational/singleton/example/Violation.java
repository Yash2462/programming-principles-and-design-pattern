package design_patterns.creational.singleton.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Violation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance1 = Singleton.getInstance();

        // Violation: use reflection to create another instance
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = constructor.newInstance();

        // check if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
