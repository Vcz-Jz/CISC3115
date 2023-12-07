class ShapeClient {
  public static void main(String[] args) {
  /*
    GeometricObject object;

    if (Math.random() > 0.5) {
        object = new Rectangle(5.0, 10.0);
    } else {
        object = new Circle(5.0);
    }
    
    System.out.println(object.getName());
  */
  
  
  
 
    GeometricObject shape = new GeometricObject();
    //String s = shape.toString();
    Rectangle r = new Rectangle(5, 10);
    // System.out.println(s);
    Circle c1 = new Circle(5.0);
    Circle c2 = new Circle(2.0);
    Circle c3 = new Circle(5.0);
    
    System.out.println(c1.equals(r));
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));    
    
    //    c.equals((Object)s); // casting
   
   /* 
    Circle c = new Circle(5.0);
    s = c.toString();
    System.out.println(s);
    
    s = c.toString("Circle's");
    System.out.println(s);
    
    c.helloFromShape();
    
    Rectangle r = new Rectangle();
    String circleName = c.getName();
    String rectName = r.getName();
    double circleArea = c.getArea();
    double rectArea = r.getArea();
    
    System.out.println();
    */
    
    
    GeometricObject[] shapeList = new GeometricObject[5];
    for (int i=0; i<shapeList.length; i++) {
      if (Math.random() > 0.5) {
          shapeList[i] = new Rectangle(5.0, 10.0);
      } else {
          shapeList[i] = new Circle(5.0);
      }
    }
    
    for (int i=0; i<shapeList.length; i++) {
      displayShapeObject(shapeList[i]);
    }
    
    ShapeClient client = new ShapeClient();
    client.displayShapeList(shapeList);
  }
  
  
  public static void displayShapeObject(GeometricObject object) {
    System.out.println(object.getName());
  }
  
  private void displayShapeList(GeometricObject[] shapeList) {
    for (int i=0; i<shapeList.length; i++) {
      displayShapeObject(shapeList[i]);
    }
  }
}
