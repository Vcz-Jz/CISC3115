import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class sortCircle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(Circle other) {
        // Compare circles based on their areas
        return Double.compare(this.getArea(), other.getArea());
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " and area " + getArea();
    }
}

public class SortingCircles {
    public static void main(String[] args) {
        // Create a list of Circle objects
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(3.0));
        circleList.add(new Circle(1.5));
        circleList.add(new Circle(2.5));

        // Sort the list of Circles based on their areas
        Collections.sort(circleList);

        // Display the sorted list of Circles
        System.out.println("Sorted Circles based on areas:");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }
}
