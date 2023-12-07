import java.util.ArrayList;

class Zoo {
  public static void main(String[] args) {
    FlyMotion[] flyableList = {
      new FlyingCat(),
      new Dove()
    };
    
    go(flyableList);
    
    ArrayList<Animal> animalList = new ArrayList<Animal>();
    animalList.add(new FlyingCat());
    animalList.add(new Dove());
    animalList.add(new Whale());
    yell(animalList);
  }
  
  public static void go(FlyMotion[] flyableList) {
    for (FlyMotion flyable: flyableList) {
      flyable.fly();
    }
  }
  
  public static void yell(ArrayList<Animal> animalList) {
    for (Animal animal: animalList) {
      animal.makeNoise();
    }
  }
}
