package solid_principles.dependency_inversion.solution;

public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new MechanicalKeyboard();
        Computer computer = new Computer(keyboard);
        computer.useKeyboard();
    }
}
