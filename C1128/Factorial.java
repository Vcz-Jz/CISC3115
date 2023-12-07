class Factorial {
  public static void main(String[] args) {
    Factorial client = new Factorial();
    int result = client.factorial(5);
    System.out.printf("%d! = %d\n", 5, result);
  }

  int factorial(int n) {
    // return n * factorial(n - 1);
    if (n == 0) { // base case
      return 1;
    } else {
     return n * factorial(n - 1);
    }
  }
}
