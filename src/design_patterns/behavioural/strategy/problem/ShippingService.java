package design_patterns.behavioural.strategy.problem;

public class ShippingService {
    public double calculateShipping(String type, double weight) {
        if (type.equals("standard")) {
            return weight * 1.0;
        } else if (type.equals("express")) {
            return weight * 1.5;
        } else if (type.equals("overnight")) {
            return weight * 2.5;
        }
        return 0;
    }
}

