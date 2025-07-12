package design_patterns.behavioural.strategy.solution;

public class ExpressShipping implements ShippingStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 2.0; // Express shipping is more expensive
    }
}
