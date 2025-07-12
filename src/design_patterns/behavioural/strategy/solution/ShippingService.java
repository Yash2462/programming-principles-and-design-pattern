package design_patterns.behavioural.strategy.solution;

public class ShippingService {
    private ShippingStrategy strategy;

    public ShippingService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShipping(double weight) {
        return strategy.calculate(weight);
    }

    public static void main(String[] args) {
        ShippingService service = new ShippingService(new StandardShipping());
        System.out.println("Standard Shipping: " + service.calculateShipping(10.0));

        service.setStrategy(new ExpressShipping());
        System.out.println("Express Shipping: " + service.calculateShipping(10.0));

        service.setStrategy(new OvernightShipping());
        System.out.println("Overnight Shipping: " + service.calculateShipping(10.0));
    }
}

