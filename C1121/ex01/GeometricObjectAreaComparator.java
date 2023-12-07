import java.util.Comparator;

class GeometricObjectAreaComparator implements Comparator<GeometricObject> {
    public int compare(GeometricObject lhs, GeometricObject rhs) {
      return Double.compare(lhs.getArea(), rhs.getArea());
      /*
      if (lhs.getArea() > rhs.getArea()) {
        return 1;  // lhs > rhs if the condition holds
      } else if (lhs.getArea() < rhs.getArea()) {
        return -1;
      } else {
        return 0;
      }
      */
    }
}
