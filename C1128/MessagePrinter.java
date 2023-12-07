class MessagePrinter {
  public static void main(String[] args) {
    MessagePrinter msgPrinter = new MessagePrinter();
    msgPrinter.printMessage(5, "Hello, Recursion!");
  }

  void printMessage(int n, String msg) {
     if (n == 0) {
      return;
     } else {
      System.out.println(msg);
      printMessage(n-1, msg);
     }
  }
}
