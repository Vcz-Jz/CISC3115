abstract class GeometricObject {
  private String id;
  private String name;
  /*
  public double getArea() {
    throw new RuntimeException("Operation not supported");
  }
  */
  public abstract double getArea();
  
  /*
  public GeometricObject getCopy() {
    return new GeometricObject();
  } 
  */
  public abstract GeometricObject getCopy();
}
