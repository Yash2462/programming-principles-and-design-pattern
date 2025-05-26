package solid_principles.dependency_inversion.problem;

/**
 * The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules.
 * Both should depend on abstractions. Additionally, abstractions should not depend on details. Details should depend on abstractions.
 */


/**
 * Consider a scenario where a Keyboard class is directly used by a Computer class. This creates a tight coupling between the Computer and Keyboard classes,
 * making it difficult to change the Keyboard implementation without modifying the Computer class.
 */
public class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard){
        this.keyboard=keyboard;
    }

    public void UseKeyboard(){
        keyboard.type();
    }
}
