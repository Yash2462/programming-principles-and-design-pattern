package types_of_relationships_between_classes.Inheritance;

public class Car extends Vehicle {

    @Override
    public void honk() {
        System.out.println("Car is honking");
    }

    public static void main(String[] args) {
        Car car = new Car();

        // Using the honk method from the Vehicle class
        car.honk(); // Output: Car is honking
    }
}
