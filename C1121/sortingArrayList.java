import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        // Create an Integer ArrayList
        List<Integer> intList = new ArrayList<>(Arrays.asList(2, 4, 3));

        // Create a Double ArrayList
        List<Double> doubleList = new ArrayList<>(Arrays.asList(3.4, 1.3, -22.1));

        // Create a Character ArrayList
        List<Character> charList = new ArrayList<>(Arrays.asList('a', 'J', 'r'));

        // Create a String ArrayList
        List<String> stringList = new ArrayList<>(Arrays.asList("Tom", "John", "Fred"));

        // Sort the ArrayLists
        Collections.sort(intList);
        Collections.sort(doubleList);
        Collections.sort(charList);
        Collections.sort(stringList);

        // Display the sorted ArrayLists
        System.out.print("Sorted Integer objects: ");
        printList(intList);
        System.out.print("Sorted Double objects: ");
        printList(doubleList);
        System.out.print("Sorted Character objects: ");
        printList(charList);
        System.out.print("Sorted String objects: ");
        printList(stringList);
    }

    /** Print a list of objects */
    public static void printList(List<?> list) {
        for (Object element : list)
            System.out.print(element + " ");
        System.out.println();
    }
}
