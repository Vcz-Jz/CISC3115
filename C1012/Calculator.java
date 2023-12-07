class Calculator {
  public static int divide(int op1, int op2) {
    if (op2 == 0) {
      throw new java.lang.RuntimeException("op2 is 0");
    } 
    int result = op1 / op2;
    return result;
  }
}
