package solid_principles.dependency_inversion.solution;

public class MechanicalKeyboard implements Keyboard{

    @Override
    public void type() {
        System.out.print("typing with Mechanical Keyboard");
    }
}
