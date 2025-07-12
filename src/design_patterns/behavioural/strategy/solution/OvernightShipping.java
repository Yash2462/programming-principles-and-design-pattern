package design_patterns.behavioural.strategy.solution;

public class OvernightShipping implements ShippingStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 2.5;
    }
}
