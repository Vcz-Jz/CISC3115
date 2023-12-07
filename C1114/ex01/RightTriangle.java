class RightTriangle extends Triangle {
  private double height;
  private double base;
  
  public RightTriangle(double height, double base) {
    this.height = height;
    this.base = base;
  }
  
  public RightTriangle(RightTriangle triangle) {
    this(triangle.height, triangle.base);
  }
  
  public double getArea() {
    double area = height * base / 2;
    return area;
  }
  
  public boolean isEquilateral() {
  /*
    if (height == base) return true;
    else return false;
  */
    return height == base;
  }
}
