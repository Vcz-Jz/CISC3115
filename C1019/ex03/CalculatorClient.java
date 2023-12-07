class CalculatorClient {
  public static void main(String[] args) {
    if (args.length != 2) {
      helpAndExit();
    }
    
    try {
      int quotient = doDivision(args);
      displayResult("The quotient is ", quotient);
    } catch (java.io.IOException e) {
      // System.out.println("Exception " + e + " is caught again!");
      // e.printStackTrace();
      System.out.println("Denominator cannot be zero!");
    } catch (InvalidDenominatorException e) {
      System.out.println(e.getMessage()); 
    } catch (InvalidNumeratorException e) {
      System.out.println(e.getMessage());
    }
  }
  
  private static int doDivision(String[] args) 
    throws java.io.IOException, 
       InvalidNumeratorException, InvalidDenominatorException {
  
    validateInput(args);
    
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
  
  private static void validateInput(String[] args) throws InvalidNumeratorException, InvalidDenominatorException {
    // if args[0] looks like a number, it is good; otherwise, error
    if (!isStringNumber(args[0])) {
      throw new InvalidNumeratorException("Numerator \"" + args[0] + "\" is not a valid number");
    }
    
    if (!isStringNumber(args[1])) {
      throw new InvalidDenominatorException("Denominator \"" + args[1] + "\" is not a valid number");
    }
  }
  
  private static boolean isStringNumber(String s) {
    for (int i=0; i<s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) return false;
    }
    return true;
  }
}



