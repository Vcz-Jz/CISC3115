class Cat extends Feline implements CatMotion {
  public void pounce() {
    System.out.println("Cat::pounce()");
  }
  
  public void makeNoise() {
    System.out.println("Cat::makeNoise()");
  }
}
