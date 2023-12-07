class BubbleSortClient {
  public static void main(String[] args) {
    BubbleSort sorter = new BubbleSort(5);
    
    System.out.println("Before sorting ...");
    sorter.printNumbers();
    sorter.sort();
    System.out.println("After sorting ...");
    sorter.printNumbers();

  }
}
