class Dove extends Animal implements FlyMotion {
  public Dove(String name) {
    super(name);
  }
  
  public void makeNoise() {
    System.out.println("Coo");
  }
  
  public void fly() {
    System.out.println("Fly");
  }
}
