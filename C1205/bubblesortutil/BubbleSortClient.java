import java.util.Random;

class BubbleSortClient {
  public static void main(String[] args) {
    int size = 5;
    if (args.length > 0) {
      size = Integer.parseInt(args[0]);
    }
    int[] numbers = new int[size];

    Random rng = new Random();
    for (int i=0; i<numbers.length; i++) {
      numbers[i] = rng.nextInt();
    }


    System.out.println("Before sorting ...");
    printNumbers(numbers, 5);
    BubbleSort.sort(numbers);
    System.out.println("After sorting ...");
    printNumbers(numbers, 5);

  }

  private static void printNumbers(int[] numbers) {
    for (int i=0; i<numbers.length; i++) {
      // numbers[0] = ....
      System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
    }    
  }

  private static void printNumbers(int[] numbers, int n) {
    for (int i=0; i<numbers.length && i<n; i++) {
      // numbers[0] = ....
      System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
    }    
  }

}
