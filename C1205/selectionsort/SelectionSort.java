class SelectionSort {
  public static void sort(int[] numbers) {
    selectionSortHelper(numbers, 0, numbers.length-1);
  }
  private static void selectionSortHelper(int[] numbers, int beginIndex, int endIndex) {
    // the endIndex is inclusive
    if (endIndex <= beginIndex) return; // base case

    selectAndSwap(numbers, beginIndex, endIndex);
    selectionSortHelper(numbers, beginIndex, endIndex-1);    
  }
  private static void selectAndSwap(int[] numbers, int beginIndex, int endIndex) {
    int maxIndex = findLargest(numbers, beginIndex, endIndex);
    swap(numbers, maxIndex, endIndex);
  }
  
  private static void swap(int[] numbers, int i, int j) {
    int tmp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = tmp;
  }

  private static int findLargest(int[] numbers, int beginIndex, int endIndex) {
    // the endIndex is inclusive
    // if you know numbers.length is at least 1, the following works
    // we want this function returns the index of the largest
    int maxIndex = beginIndex;
    for (int i=beginIndex+1; i<=endIndex; i++) {
      int max = numbers[maxIndex];
      if (numbers[i] > max) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

}
