package design_patterns.behavioural.strategy.solution;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculate(double weight) {
        return weight;
    }
}
