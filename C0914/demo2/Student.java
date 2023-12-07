class Student {
  private final int COURSE_CAPACITY = 10;
  
  private int nextIndex; // next available elemtn in coursesTaken
  private Course[] coursesTaken;
  
  public Student() {
    coursesTaken = new Course[COURSE_CAPACITY];
    nextIndex = 0;
  }
  
  public void addAllCourses(int[] credits, String[] grades) {
    for (int i = 0; i<credits.length; i++) {
      coursesTaken[i] = new Course(credits[i], grades[i]);
    }
  }
  
  public void addCourse(int credits, String grade) {
    Course course = new Course(credits, grade);
    coursesTaken[this.nextIndex] = course;
    this.nextIndex ++;
  }
  
  private double computeGpa(Course[] courses) {
    double totalPoints = 0;
    int totalCredits = 0;
    for (int i=0; i<this.nextIndex; i++) {
      // System.out.println(courses[i]);
      double points = courses[i].getGradePoints();
      totalPoints += points;
      totalCredits += courses[i].getCredits();
    }
    double gpa = totalPoints / totalCredits;
    return gpa;
  }
  
  public void showGpa() {
    double gpa = computeGpa(this.coursesTaken);
    System.out.printf("GPA is %.3f\n", gpa);
  }
}
