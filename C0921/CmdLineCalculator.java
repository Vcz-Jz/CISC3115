import java.math.BigDecimal;

class CmdLineCalculator {
  public static void main(String[] args) {
    if (args.length != 2) {
      printUsage();
      return;
    }
    
    BigDecimal op1 = new BigDecimal(args[0]);
    BigDecimal op2 = new BigDecimal(args[1]);
    BigDecimal product = op1.multiply(op2);
    
    System.out.printf("%s + %s = %s\n", op1.toString(), op2.toString(), product);
  }
  
  private static void printUsage() {
    System.out.println("Usage: CmdLineCalculator op1 op2");
  }
}
