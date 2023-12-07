class CourseClient {
  public static void main(String[] args) {
    Course course1 = new Course("A", 4);
    Course course2 = new Course(course1);
    String s1 = course1.infoToString();
    System.out.println(s1);
    String s2 = course2.infoToString();
    System.out.println(s2);
    
    course1.setCredits(5);
    System.out.println(course1.infoToString());
    Address address = new Address("2900 Bedford Ave");
    course1.setAddress(address);
    Address addressReturned = course1.getAddress();
    address.setAddress("1111 2222 3333");
    System.out.println(addressReturned.infoToString());
  }
}
