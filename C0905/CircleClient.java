class CircleClient {
  public static void main(String[] args) {
    Circle circle1 = new Circle(1.0);
    Circle circle2 = new Circle(25);
    Circle circle3 = new Circle(125);
    
    double areaOfCircle1 = circle1.getArea();
    System.out.println("The area of circle1 is " + areaOfCircle1);
    double areaOfCircle2 = circle2.getArea();
    System.out.println("The area of circle2 is " + areaOfCircle2);
    double areaOfCircle3 = circle3.getArea();
    System.out.println("The area of circle3 is " + areaOfCircle3);
  }
}
