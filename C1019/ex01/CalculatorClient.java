class CalculatorClient {
  public static void main(String[] args) {
    int numerator = Integer.parseInt(args[0]);
    int denominator = Integer.parseInt(args[1]);

    try {
      int quotient = Calculator.divide(numerator, denominator); 
      System.out.println("The quotient is " + quotient);  
      // System.exit(0);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Reached the finally block");
    }
  }
}
