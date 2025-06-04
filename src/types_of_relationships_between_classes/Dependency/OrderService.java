package types_of_relationships_between_classes.Dependency;

//Here the OrderService class depends on the PaymentService class.
public class OrderService {

    public void processOrder(PaymentService paymentService) {
        // Process the order using paymentService
    }
}
