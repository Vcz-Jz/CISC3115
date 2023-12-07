class Whale extends Animal implements SwimMotion {
  public void makeNoise() { // inherited from Animal
    System.out.println("Chip");
  }  
  
  public void swim() { // inherited from SwimMotion
    System.out.println("Swim");
  }
}
