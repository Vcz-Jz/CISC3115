class Circle extends GeometricObject {
  private double radius;
  
  public Circle() {
    super();
  }
  
  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }
  
  public double getArea() {
    // TODO: just a stub
    return -1;
  }
}
