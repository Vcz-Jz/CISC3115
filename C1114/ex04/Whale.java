class Whale extends Animal implements SwimMotion {
  public void swim() {
    System.out.println("Whale::swim()");
  }
  
  public void makeNoise() {
    System.out.println("Whale::makeNoise()");
  }
}
