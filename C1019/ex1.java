class InvalidRadiusException extends RuntimeException {
    public InvalidRadiusException(String message) {
        super(message);
    }
}

class InvalidNameException extends RuntimeException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class ex1 {
    private String name;
    private double radius;

    public Circle(String name, double radius) {
        if (radius <= 0) {
            throw new InvalidRadiusException("Invalid radius: " + radius);
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Invalid name: " + name);
        }

        this.name = name;
        this.radius = radius;
    }

    // Other Circle methods...
}

public class CircleClient {
    public static void main(String[] args) {
        try {
            Circle circle1 = new Circle("Circle 1", 5.0);
            Circle circle2 = new Circle("", 3.0); // This should throw InvalidNameException
            Circle circle3 = new Circle("Circle 3", -2.0); // This should throw InvalidRadiusException

            // Do something with the circles...
        } catch (InvalidRadiusException e) {
            System.out.println("Invalid Radius Exception: " + e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name Exception: " + e.getMessage());
        }
    }
}
