package dry_principle.problem;

// Bad practice: This class does not follow the DRY principle as it does not encapsulate any reusable logic or functionality.
public class Calculator {

    // here logic is repeated for different methods
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using the add method with two parameters
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum1);

        // Using the add method with three parameters
        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum2);
    }
}
