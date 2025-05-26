package solid_principles.dependency_inversion.solution;

public class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void useKeyboard() {
        keyboard.type();
    }
}
