class Circle {
  double radius;

  Circle() {
    radius = 0;
  }

  Circle(double r) {
    radius = r;
  }

  double getArea() {
    double area = Math.PI * radius * radius;
    return area;
  }

}
