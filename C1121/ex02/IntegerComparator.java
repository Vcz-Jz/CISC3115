import java.util.Comparator;

class IntegerComparator implements Comparator<Integer> {
  public int compare(Integer lhs, Integer rhs) {
    if (lhs > rhs) return 1;
    else if (lhs < rhs) return -1;
    else return 0;
  }
}
