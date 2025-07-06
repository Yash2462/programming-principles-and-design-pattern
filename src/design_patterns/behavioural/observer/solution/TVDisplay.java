package design_patterns.behavioural.observer.solution;

public class TVDisplay implements Display{

    @Override
    public void update(int temperature) {
        System.out.println("TV Display: " + temperature);
    }
}
