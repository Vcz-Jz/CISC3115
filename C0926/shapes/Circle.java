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
    double area = Math.PI * radius * radius;
    return area;
  }
  
  // overriding - provides another implementation of the same method
  public String toString() {
    String s = String.format("Circle[radius=%.2f]", radius);
    return s;
  }
  
  // overload the toString method
  public String toString(String prefix) {
    String s = String.format("%s:toString(String):%s", prefix, toString());
    return s;
  }
  
  // this is not overriding because this class doesn't inherit the helloFromShape method
  // from its parent. 
  public void helloFromShape() {
    System.out.println("Hello!");
  }
  
  public String getName() {
    String name = String.format("Circle[radius=\"%.1f\"]", radius);
    return name;
  }
  // am I overriding the equals method? 
  public boolean equals(Object c) {
    if (c instanceof Circle) {
      Circle theOther = (Circle)c;
      return this.radius == theOther.radius;
    } else {
      return false;
    }
  }
  
}



