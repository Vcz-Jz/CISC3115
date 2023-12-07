abstract class Animal {
  private String name;
  
  public Animal() {
    this("N/A");
  }
  
  public Animal(String name) {
    this.name = name;
  }
  
  public abstract void makeNoise();
}
