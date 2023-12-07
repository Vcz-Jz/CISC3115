class DivideByZeroClient {
  public static void main(String[] args) {
    double op1 = 5.; 
    double op2 = 0.;
    
    try {
      DivideByZero zero = new DivideByZero();
      zero.quotient(op1, op2);
    } catch (java.io.IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
