class Course {
  private int credits;
  private String grade; // A & B
  
  public Course(int credits, String grade) {
    this.credits = credits;
    this.grade = grade;
  }
  
  public int getCredits() {
    return credits;
  }
  
  public double getGradePoints() {
    double gradePoints;
    
    if (grade.equals("A")) {
      gradePoints = 4.0;
    } else {
      gradePoints = 3.0;
    }
    
    return gradePoints * credits;
  }
}
