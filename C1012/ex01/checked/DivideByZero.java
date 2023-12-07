class DivideByZero {
  public int quotient(int op1, int op2) throws java.io.IOException {
    if (op2 == 0) {
      throw new java.io.IOException("op2 is 0");
    }
    int result = op1 / op2;
    return result;
  }
  
  public double quotient(double op1, double op2) throws java.io.IOException {
    if (op2 == 0.0) {
      throw new java.io.IOException("op2 is 0.0");
    }
    double result = op1 / op2;
    return result;
  }
}


