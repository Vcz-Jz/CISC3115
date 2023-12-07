class Circle {
  // data fields: instance variable
  double radius;
  
  // constructor: initialized data fields for an object we are going to create
  Circle() {
    radius = 0;
  }
  
  Circle(double r) {
    radius = r;
  }

  // behavior or methods: instance method
  double getArea() {
    // PI * radius * radius
    double area = Math.PI * radius * radius;
    return area;
  }
  
}
