import java.util.ArrayList;
import java.util.List;

class sortingWeight {
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

public class CustomAnimalSort {

    public static void sortByWeightDescending(List<Animal> animals) {
        for (int i = 0; i < animals.size() - 1; i++) {
            for (int j = 0; j < animals.size() - 1 - i; j++) {
                if (animals.get(j).getWeight() < animals.get(j + 1).getWeight()) {
                    // Swap the positions if the current animal is lighter than the next one
                    Animal temp = animals.get(j);
                    animals.set(j, animals.get(j + 1));
                    animals.set(j + 1, temp);
                }
            }
        }
    }

    public static void sortByWeightAscending(List<Animal> animals) {
        for (int i = 0; i < animals.size() - 1; i++) {
            for (int j = 0; j < animals.size() - 1 - i; j++) {
                if (animals.get(j).getWeight() > animals.get(j + 1).getWeight()) {
                    // Swap the positions if the current animal is heavier than the next one
                    Animal temp = animals.get(j);
                    animals.set(j, animals.get(j + 1));
                    animals.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Elephant", 5000));
        animals.add(new Animal("Giraffe", 1800));
        animals.add(new Animal("Hippopotamus", 2000));

        System.out.println("Original order:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        sortByWeightDescending(animals);

        System.out.println("\nDescending order by weight:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        sortByWeightAscending(animals);

        System.out.println("\nAscending order by weight:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
