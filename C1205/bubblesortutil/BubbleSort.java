import java.util.Random;

class BubbleSort {
  public static void sort(int[] numbers) {
    sortHelper(numbers, 0, numbers.length-1);
  }
  
  public static void sortHelper(int[] numbers, int beginIndex, int endIndex) {
    // System.out.printf("beginIndex = %d endIndex = %d\n", beginIndex, endIndex);
    // beginIndex and endIndex are inclusive 
    
    // base case - if the part of the array that you are bubbling up
    // contains 0 or 1 element, we don't need to do anything, because
    // that part of the array is already sorted. 
    if (endIndex <= beginIndex) return;
    
    // System.out.printf("beginIndex = %d endIndex = %d\n", beginIndex, endIndex);
    bubbleUp(numbers, beginIndex, endIndex);
    sortHelper(numbers, beginIndex, endIndex-1);
  }
  
  private static void bubbleUp(int[] numbers, int beginIndex, int endIndex) {
    // let's beginIndex is 0, endIndex is 5
    // compare elements at 0 and 1
    // compare elements at 1 and 2
    // ...
    // compare elements at 4 and 5
    for (int i=beginIndex; i<endIndex; i++) {
      // compare element i and element i+1
      if (numbers[i] > numbers[i+1]) {
        // swap these values of these two elements
        int tmp = numbers[i+1];
        numbers[i+1] = numbers[i];
        numbers[i] = tmp;
        
        /*
        int tmp = numbers[i];
        numbers[i] = numbers[i+1];
        numbers[i+1] = tmp;
        */
      }
    }
  }
}










