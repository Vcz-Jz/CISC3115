class DateDemo {
  public static void main(String[] args) {
    java.util.Date date = new java.util.Date();
    System.out.println(date.toString());
    
    date = new java.util.Date(121, 10, 1);// year 1900+121, month: 10+1(November), day: 1
    System.out.println(date.toString());
        
    long millis = date.getTime();
    System.out.println(millis);
    
    // factory method
  }
}
