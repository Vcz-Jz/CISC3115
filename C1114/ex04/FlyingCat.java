class FlyingCat extends Feline implements CatMotion, FlyMotion {
  public void makeNoise() {
    System.out.println("FlyingCat::makeNoise()");
  }
  
  public void pounce() {
    System.out.println("FlyingCat::pounce()");
  }
  
  public void fly() {
    System.out.println("FlyingCat::fly()");
  }
}
