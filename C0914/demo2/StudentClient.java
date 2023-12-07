class StudentClient {
  public static void main(String[] args) {
    Student student = new Student();
    student.addCourse(4, "A");
    student.addCourse(4, "B");
    student.showGpa();
  }
}
