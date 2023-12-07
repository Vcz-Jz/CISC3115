import java.util.ArrayList;

class ShapeCollection {
  private ArrayList<GeometricObject> shapeList;
  
  public ShapeCollection(ArrayList<GeometricObject> shapeList) {
    this.shapeList = new ArrayList<GeometricObject>();
    for (GeometricObject shape: shapeList) {
      this.shapeList.add(shape.getCopy());      
    }
  }
  
  double totalArea() {
    double total = 0.0;
    for (GeometricObject shape: shapeList) {
      total += shape.getArea();
    }
    return total;
  }
}
