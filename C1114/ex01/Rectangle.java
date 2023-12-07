class Rectangle extends GeometricObject {
  private double width;
  private double length;
  
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }
  
  public double getArea() {
    double area = width * length;
    return area;
  }
}
