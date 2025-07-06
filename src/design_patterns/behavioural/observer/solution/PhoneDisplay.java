package design_patterns.behavioural.observer.solution;

public class PhoneDisplay implements Display {

    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: " + temperature);
    }
}
