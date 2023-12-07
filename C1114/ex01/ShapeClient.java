import java.util.ArrayList;

class ShapeClient {
  public static void main(String[] args) {
    ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
    shapeList.add(new RightTriangle(10, 5));
    shapeList.add(new EquilateralTriangle(15));
    shapeList.add(new GeometricObject());
    shapeList.add(new Triangle());
    shapeList.add(new Rectangle(10, 8));
    shapeList.add(new Circle(5));
    
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
