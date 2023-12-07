class ArrayDemo {
  private Student[] students;
  
  public ArrayDemo(int numStudents) {
    students = new Student[numStudents];

    for (int i=0; i<students.length; i++) {
      students[i] = new Student();
    }

    
    int numStudentsToFill = 100;
    if (students.length < numStudentsToFill) {
      System.out.println("array too short");
      
      Student[] otherStudents = new Student[numStudentsToFill];
      for (int i=0; i<students.length; i++) {
        otherStudents[i] = students[i];
      }
      students = otherStudents;
    }
    
    System.out.println("accessing " + (numStudentsToFill-1) + " element");
    students[numStudentsToFill-1] = new Student();
  }
  
  public static void main(String[] args) {
    ArrayDemo demo = new ArrayDemo(10);
  }
  
}
