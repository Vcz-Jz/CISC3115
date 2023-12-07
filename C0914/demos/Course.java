class Course {
  private String grade;  // immutable
  private int credits;
  private Address address;

  public Course(String grade, int credits) {
    this.grade = grade;
    this.credits = credits;
  }
    
  public Course(Course course) {
    this.grade = course.grade;
    this.credits = course.credits;
  }
  
  public String infoToString() {
    // Course[grade="A",credits= 4]
    String s;
    // escape sequence
    s = "Course[grade=\"" + grade + "\",credits= " + credits + "]";
    return s;
  }
  
  // setter -> make Course object mutable
  public void setCredits(int credits) {
    this.credits = credits;
  }
  
  public void setAddress(Address newAddress) {
    this.address = new Address(newAddress); // textbooks always write this, don't do this. 
  }
  
  public Address getAddress() {
    return new Address(address); // textbooks always write this, don't do this. 
  }
}
