package solid_principles.liskov_substitution.solution;

public class Duck extends FlyingBird {

    @Override
    public void fly() {
        //  Duck flying
        System.out.println("Duck is flying");
    }
}
