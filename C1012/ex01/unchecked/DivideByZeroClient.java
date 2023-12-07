class DivideByZeroClient {
  public static void main(String[] args) {
    
    try {
      double op1 = 5.; 
      double op2 = 0.;
      DivideByZero zero = new DivideByZero();
      zero.quotient(op1, op2);
      
      int op3 = 5;
      int op4 = 0;
      zero.quotient(op3, op4);
    } catch (java.lang.ArithmeticException e) {
      System.out.println("Error on Integer Division: " + e.getMessage());
    } catch (java.io.IOException e) {
      System.out.println("Error on Double Division: " + e.getMessage());
    } catch (Exception e) {   
      System.out.println("Error: " + e.getMessage());
    }
  }
}
