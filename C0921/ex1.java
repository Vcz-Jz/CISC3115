class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    // Additional properties and methods for Circle can be added here
    public Circle(String name) {
        super(name);
    }
}

class Rectangle extends Shape {
    // Additional properties and methods for Rectangle can be added here
    public Rectangle(String name) {
        super(name);
    }
}

public class ShapeClient {
    public static void main(String[] args) {
        Shape shape = new Shape("Generic Shape");
        Circle circle = new Circle("My Circle");
        Rectangle rectangle = new Rectangle("My Rectangle");

        System.out.println("Shape name: " + shape.getName());
        System.out.println("Circle name: " + circle.getName());
        System.out.println("Rectangle name: " + rectangle.getName());
    }
}
