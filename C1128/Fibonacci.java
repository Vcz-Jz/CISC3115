class Fibonacci {
  public static void main(String[] args) {
    Fibonacci cli = new Fibonacci();
    
    int result = cli.fibonacci(6);
    System.out.printf("fibonacci(6) = %d\n", result);
  }


  int fibonacci(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else {
      return fibonacci(n-1) + fibonacci(n-2);
    }
  }
}
