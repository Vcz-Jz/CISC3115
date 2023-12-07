class Student {
  private String name;
  
  public Student() {
  }
  
  public Student(String name) {
    this.name = name;
  }
  
  public String toString() {
    String s = "Student[name=\"" + name + "\"]";
    return s;
  }
  
  public boolean equals(Object other) {
    if (other instanceof Student) {
      Student otherStudent = (Student)other;
      // return student.name.toString(other.name)
      return java.util.Objects.equals(this.name, otherStudent.name);
      /*
      if (name != nul) {
      } else {
      }
      */
    } else {
      return false;
    }
  }
}
