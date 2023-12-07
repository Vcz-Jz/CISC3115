abstract class GeometricObject implements Comparable<GeometricObject> {
  public abstract double getArea();
  
  public int compareTo(GeometricObject rhs) {
    if (this.getArea() > rhs.getArea()) {
      return -1;  // lhs > rhs if the condition holds
    } else if (this.getArea() < rhs.getArea()) {
      return 1;
    } else {
      return 0;
    }
  }
}
