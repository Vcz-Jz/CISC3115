import java.util.ArrayList;
import java.util.List;

class heaviestAnimal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (Weight: " + weight + " kg)";
    }
}

public class HeaviestAnimalFinder {

    public static Animal findHeaviestAnimal(List<Animal> animals) {
        if (animals == null || animals.isEmpty()) {
            return null; // Return null if the list is empty or null
        }

        Animal heaviestAnimal = animals.get(0); // Assume the first animal is the heaviest

        for (Animal animal : animals) {
            if (animal.getWeight() > heaviestAnimal.getWeight()) {
                heaviestAnimal = animal;
            }
        }

        return heaviestAnimal;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Elephant", 5000));
        animals.add(new Animal("Giraffe", 1800));
        animals.add(new Animal("Hippopotamus", 2000));

        Animal heaviestAnimal = findHeaviestAnimal(animals);

        if (heaviestAnimal != null) {
            System.out.println("The heaviest animal is: " + heaviestAnimal);
        } else {
            System.out.println("No animals in the list.");
        }
    }
}
