import java.util.Random; // asign an alias to java.util.Random, the alias is Random

class RandomDemo {
  public static void main(String[] args) {
    Random rng = new Random();
    
    double[] numbers = new double[10];
    for (int i=0; i<numbers.length; i++) {
      numbers[i] = rng.nextDouble();
    }
    for (int i=0; i<numbers.length; i++) {
      System.out.printf("numbers[%2d] = %8f\n", i, numbers[i]);
    }
    
  }
}
