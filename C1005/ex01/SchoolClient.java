class SchoolClient {
   public static void main(String[] args) {
    School school = new School("BC");
    
    /*
    for (int i=0; i<100; i++) {
      school.appendStudent(new Student());
    }
    
    school.addStudent(0, new Student());
    
    System.out.println("School size: " + school.getNumberOfStudents());
    
    boolean result = school.addStudent(200, new Student());
    System.out.println("Added successfully at index " + 200 + " ? " + result);
    
    school.listAllStudents();
    */
    
    school.appendStudent(new Student("John Doe"));
    school.appendStudent(new Student("John Doe"));
    school.listAllStudents();
    int resultIndex = school.findStudent(new Student("John Doe"));
    System.out.println("Student John Doe is found at index " + resultIndex);
   }
}
