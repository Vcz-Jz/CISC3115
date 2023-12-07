import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
class TestInsert {
    private static List<Integer> makeRandomList(int size, List<Integer> list) {
        if (list == null) {
            return null;
        }

        Random rng = new Random();

        for (int i=0; i<size; i++) {
            list.add(rng.nextInt());
        }

        return list;
    }
    
    private static void printList(List<Integer> list) {
      /*
      for (int i=0; i<list.size(); i++) {
        int n = list.get(i);
        System.out.println(n);
      }
      */
      /*
      for (Integer n: list) {
        System.out.println(n);
      }
      */
      ListIterator<Integer> iterator = list.listIterator();
      while (iterator.hasNext()) {
        int n = iterator.next();
        System.out.println(n);
      }
    }

    private static void measureInsertionAtMiddle(List<Integer> list, int numInserted) {
        System.out.println("Test insertion on " + list.getClass().getName());
        ListIterator<Integer> iter = list.listIterator();
        for (int i=0; i<list.size()/2; i++) {
            iter.next();
        }

        Random rng = new Random();

        System.out.println("Beginning Size: " + list.size());

        long t1 = System.currentTimeMillis();
        for (int i=0; i<numInserted; i++) {
            iter.add(rng.nextInt());
        }
        long t2 = System.currentTimeMillis();
        System.out.printf("It took %d ms to insert %d elements in the middle\n",
                t2 - t1, numInserted);

        System.out.println("Ending Size: " + list.size());
    }
    
    private static void measureBinearSearch(List<Integer> list, int numInteresteds) {
        System.out.println("Test binary search on " + list.getClass().getName());
        ListIterator<Integer> iter = list.listIterator();
        for (int i=0; i<list.size()/2; i++) {
            iter.next();
        }
        iter.add(numInteresteds);
        IntegerComparator comparator = new IntegerComparator();

        Collections.sort(list, comparator);

        long t1 = System.currentTimeMillis();
        Collections.binarySearch(list, numInteresteds, comparator);       
        long t2 = System.currentTimeMillis();
        System.out.printf("It took %d ms to binary search on %d elements\n",
                t2 - t1, list.size());

    }
    
    
    private static void measureSorting(List<Integer> list) {
        System.out.println("Test sorting on " + list.getClass().getName());

        long t1 = System.currentTimeMillis();
        Collections.sort(list);
        long t2 = System.currentTimeMillis();
        System.out.printf("It took %d ms to sort %d elements\n",
                t2 - t1, list.size());

    }
    

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new LinkedList<Integer>();
        list = makeRandomList(20_000_000, list);
        //  measureInsertionAtMiddle(list, 100_000);
        // measureSorting(list);
        measureBinearSearch(list, 0);
    }
}
