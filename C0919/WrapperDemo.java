class WrapperDemo {
  private static void byteDemo() {
    int numBits = Byte.SIZE;
    System.out.printf("Date type byte is of %d bits\n", numBits);
    
    System.out.printf("min(byte) = %d, max(byte) = %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
    
    String s = "123";
    int value = Byte.parseByte(s);
    System.out.printf("String \"%s\" is %d\n", s, value);   
  }
  
  private static void intDemo() {
    int numBits = Integer.SIZE;
    System.out.printf("Date type int is of %d bits\n", numBits);
    
    // Integer intObject = new Integer(5); // box a primitive value 5 in Integer
    Integer intObject = Integer.valueOf(5);
    int n = intObject;                 // implicit unboxing
    int n2 = intObject.intValue();
    System.out.printf("n is %d, n2 is %d\n", n, n2);
  }
  
  
  public static void main(String[] args) {
    byteDemo();
    intDemo();
  }
}
