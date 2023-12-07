class Dove extends Animal implements FlyMotion {
  public void fly() {
    System.out.println("Dove::fly()");
  }
  
  public void makeNoise() {
    System.out.println("Dove::makeNoise()");
  }
}
