import java.util.ArrayList;

class ShapeClient {
  public static void main(String[] args) {
    ArrayList<GeometricObject> shapeList = new ArrayList<GeometricObject>();
    
    shapeList.add(new Circle(10.0));
    shapeList.add(new Circle(5.0));
    shapeList.add(new Rectangle(5.0, 10.0));
    shapeList.add(new Rectangle(10.0, 2.0));
    // shapeList.add(new GeometricObject());  // an error: 
    
    ShapeCollection collection = new ShapeCollection(shapeList);
    double totalArea = collection.totalArea();
    System.out.println("Total Area: " + totalArea);
  }
}
