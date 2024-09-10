public class SimpleCalculator {

    public double add(double a, double b) {
        return a + b;

    }
    public double subtract(double a, double b) {
        return a - b;

    }
    public double multiply(double a, double b) {
        return a * b;

    }
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erorr: Cannot divide by zero");
            return 0;
        }
    }
}
