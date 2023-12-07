class SumSeries {
  public static void main(String[] args) {
    SumSeries cli = new SumSeries();
    double result;
    result = cli.m(3);
    System.out.printf("m(3) = %f\n", result);
    result = cli.m(4);
    System.out.printf("m(4) = %f\n", result);
  }

  double m(int i) {  
    if (i == 1) {
      return 1.0;
    } else {
      double sum;
      sum = m(i-1) + 1.0/i;
      return sum;
    }
  }
}
