class EquilateralTriangle extends Triangle {
  private double side;
  
  public EquilateralTriangle(double side) {
    this.side = side;
  }
  
  public double getArea() {
    double height = Math.cos(60./180.*Math.PI)*side;
    double area = height * side / 2;
    return area;
  }
  
  public boolean isEquilateral() {
    return true;
  }
}
