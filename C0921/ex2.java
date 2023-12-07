class Shape {
    private String name;

    // Default constructor
    public Shape() {
        System.out.println("In the default constructor of Shape class.");
    }

    // Parameterized constructor
    public Shape(String name) {
        this.name = name;
        System.out.println("In the constructor with name '" + name + "' of Shape class.");
    }

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    private double radius;

    // Default constructor
    public Circle() {
        System.out.println("In the default constructor of Circle class.");
    }

    // Parameterized constructor
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
        System.out.println("In the constructor with name '" + name + "' of Circle class.");
    }

    // Additional methods for Circle can be added here
}

class Rectangle extends Shape {
    private double width;
    private double length;

    // Default constructor
    public Rectangle() {
        System.out.println("In the default constructor of Rectangle class.");
    }

    // Parameterized constructor
    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
        System.out.println("In the constructor with name '" + name + "' of Rectangle class.");
    }

    // Additional methods for Rectangle can be added here
}

public class ShapeClient {
    public static void main(String[] args) {
        Circle circle = new Circle("My Circle", 5.0);
        Rectangle rectangle = new Rectangle("My Rectangle", 3.0, 4.0);
        Shape genericShape = new Shape("Generic Shape");

        // Creating instances using default constructors
        Circle defaultCircle = new Circle();
        Rectangle defaultRectangle = new Rectangle();
        Shape defaultShape = new Shape();
    }
}
