package dry_principle.solution;

//dry principle good code example
public class Calculator {

    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example usage
        int sum1 = calculator.add(1, 2, 3);
        System.out.println("Sum of 1, 2, 3: " + sum1); // Output: 6

        int sum2 = calculator.add(4, 5, 6, 7);
        System.out.println("Sum of 4, 5, 6, 7: " + sum2); // Output: 22

        int sum3 = calculator.add(10);
        System.out.println("Sum of 10: " + sum3); // Output: 10
    }
}
