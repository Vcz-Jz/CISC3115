class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  
  public double getArea() {
    double area = width * height;
    return area;
  }
  
  public String getName() {
    String name = String.format("Rectangle[width=\"%.1f\",height=\"%.1f\"]", width, height);
    return name;
  }
}
