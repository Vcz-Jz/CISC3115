class QuickSort {
  public static void sort(int[] numbers) {
    quicksort(numbers, 0, numbers.length-1);
  }
  
  private static void quicksort(int[] numbers, int beginIndex, int endIndex) {
    if (endIndex <= beginIndex) return; // base case
    
    // 1. select a pivot, simple choice, use element at beginIndex as pivot
    int pivotIndex = selectPivot(beginIndex);
    // 2. paritition the list into parts, <left part> pivot <right part> so that
    //    all the elements in the left part is smaller than pivot, and all the
    //    elements in the right part is greater than or equal to pivot
    pivotIndex = partition(numbers, beginIndex, endIndex, pivotIndex);
    /*
    System.out.printf("(begin, pivot, end) = (%d, %d, %d)\n", beginIndex,
        endIndex, pivotIndex);
    */
    // 3. apply quick sort to the left part
    quicksort(numbers, beginIndex, pivotIndex-1);
    // 4. apply quick sort to the right part
    quicksort(numbers, pivotIndex+1, endIndex);
  }
  
  private static int selectPivot(int beginIndex) {
    // returns the index of the pivot
    return beginIndex;
  }
  
 private static int partition(int[] numbers, int beginIndex, int endIndex, int
          pivotIndex) {
    // make sure pivot is moved to the very end
    swap(numbers, endIndex, pivotIndex);
    pivotIndex = endIndex;

    // begin with an invalid one, because the half is empty initially
    int lastIndexOfLowerHalf = beginIndex - 1;
    for (int i=beginIndex; i<endIndex; i++) {
      if (numbers[i] <= numbers[pivotIndex]) {
        lastIndexOfLowerHalf ++;
        swap(numbers, lastIndexOfLowerHalf, i);
      }
    }

    // move the pivot to the middle of the two partitions
    lastIndexOfLowerHalf ++;
    swap(numbers, lastIndexOfLowerHalf, pivotIndex);
    pivotIndex = lastIndexOfLowerHalf;
    return pivotIndex;
  }

  private static void swap(int[] numbers, int i, int j) {
    int tmp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = tmp;
  }

/*  
  private static void partition(int[] numbers, int beginIndex, int endIndex, int pivotIndex) {
    int pivot = numbers[pivotIndex];
    // naive method -- no actual implementation does this
    int[] tmpArr = new int[endIndex - begiinIndex + 1];
    for (int i=beginIndex; i<=endIndex; i++) {
      tmpArr[i-beginIndex] = numbers[i];
    }
    // copy anything in tmpArr that is less than the pivot to the orignal array
    int offset = 0;
    for (int i=0; i<=tmpArr.length; i++) {
      if (tmpArr[i] < pivot) {
        numbes[beginIndex+offset] = tmpArr[i];
        offset + 1;
      }
    }
    numbers[beginIndex + offset] = pivot;
    
    int offset2 = beginIndex + offset;
    for (int i=0; i<=tmpArr.length; i++) {
      if (tmpArr[i] >= pivot) {
        numbes[beginIndex+offset2] = tmpArr[i];
        offset + 1;
      }
    }
  }
*/
}
