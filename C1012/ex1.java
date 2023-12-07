class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class ex1 {
    public static double quotient(int numerator, int denominator) {
        if (denominator == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }

    public static void performDivision(int numerator, int denominator) {
        try {
            double result = quotient(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        performDivision(10, 2); // Valid division
        performDivision(8, 0); // Division by zero, exception will be caught
        performDivision(12, 3); // Valid division
    }
}
