/* we want
    java Divider Op1 Op2
*/

/*
class Divider {
  public static void main(String[] args) {
    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);
    int result = op1 / op2;
    System.out.printf("%d / %d = %d\n", op1, op2, result);
  }
}
*/
/*
class Divider {
  public static void main(String[] args) {
    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);
    if (op2 != 0) {
      int result = op1 / op2;
      System.out.printf("%d / %d = %d\n", op1, op2, result);     
    } else {
      System.out.println("Divisor cannot be 0");
    }
  }
}
*/

/*
class Divider {
  public static void main(String[] args) {
    if (args.length != 2) {
      help();
      return;
    }
    int op1 = Integer.parseInt(args[0]);
    int op2 = Integer.parseInt(args[1]);
    if (op2 != 0) {
      int result = op1 / op2;
      System.out.printf("%d / %d = %d\n", op1, op2, result);     
    } else {
      System.out.println("Divisor cannot be 0");
    }
  }
  
  private static void help() {
    System.out.println("Usage: Divider op1 op1");
  }
}
*/

/*
class Divider {
  public static void main(String[] args) {
    try {
      int op1 = Integer.parseInt(args[0]);
      int op2 = Integer.parseInt(args[1]);
      int result = op1 / op2;
      System.out.printf("%d / %d = %d\n", op1, op2, result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.toString());
    }
  }
}
*/

class Divider {
  public static void main(String[] args) throws java.io.IOException {
    try {
      int op1 = Integer.parseInt(args[0]);
      int op2 = Integer.parseInt(args[1]);
      int result = Calculator.divide(op1, op2);
      System.out.printf("%d / %d = %d\n", op1, op2, result);
    } catch (java.lang.RuntimeException e) {
      System.out.println("Error: cause: " + e.getMessage());
    }
  }
}




