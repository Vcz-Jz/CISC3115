import java.util.ArrayList;
import java.util.Collections;

class ShapeClient {
  public static void main(String[] args) {
    GeometricObject rectangle = new Rectangle(10, 5);
    GeometricObject circle = new Circle(10);
    if (rectangle.compareTo(circle) > 0) {
      System.out.println("the rectangle's area is smaller than the circle");
    }
  
    ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
    shapeList.add(new RightTriangle(10, 5));
    shapeList.add(new EquilateralTriangle(15));
    /*
    shapeList.add(new GeometricObject());
    shapeList.add(new Triangle());
    */
    shapeList.add(new Rectangle(10, 8));
    shapeList.add(new Circle(5));
    
    // ascending order
    // descending order
    //shapeList.sort();
    System.out.println("1. Before sorting ...");
    for (GeometricObject shape: shapeList) {
        System.out.println(shape.getArea());
    }
    Collections.sort(shapeList);
    System.out.println("2. After sorting ...");
    for (GeometricObject shape: shapeList) {
        System.out.println(shape.getArea());
    }
    
    
    
    double area = totalArea(shapeList);
    System.out.println(area);
  }
  
  static double totalArea(ArrayList<GeometricObject> shapeList) {
    double area = 0.0;
    for (GeometricObject shape: shapeList) {
      area += shape.getArea();
    }
    return area;
  }
}
