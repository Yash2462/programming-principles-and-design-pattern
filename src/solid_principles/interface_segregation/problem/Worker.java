package solid_principles.interface_segregation.problem;

/**
 * The Interface Segregation Principle (ISP) states that no client should be forced to depend on methods it does not use.
 * This means that larger interfaces should be split into smaller, more specific ones so that clients only need to know about the methods that are of interest to them.
 */
public interface Worker {
    void work();
    void eat();
}
