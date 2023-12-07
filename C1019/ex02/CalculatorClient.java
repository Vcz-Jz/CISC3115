class CalculatorClient {
  public static void main(String[] args) {
    if (args.length != 2) {
      helpAndExit();
    }
    
    try {
      int quotient = doDivision(args);
      displayResult("The quotient is ", quotient);
    } catch (java.io.IOException e) {
      System.out.println("Exception " + e + " is caught again!");
      e.printStackTrace();
    }
  }
  
  private static int doDivision(String[] args) throws java.io.IOException {
    int numerator = Integer.parseInt(args[0]);
    int denominator = Integer.parseInt(args[1]);

    try {
      int quotient = Calculator.divide(numerator, denominator); 
      return quotient;
    } catch (ArithmeticException e) {
      // System.out.println("doDivision: " + e);
      throw new java.io.IOException(e);
    } 
  }
  
  private static void helpAndExit() {
    System.out.println("Usage: CalculatorClient numerator denominator");
    System.exit(0);
  }
  
  private static void displayResult(String msg, int quotient) {
    System.out.println(msg + quotient);  
  }
}
