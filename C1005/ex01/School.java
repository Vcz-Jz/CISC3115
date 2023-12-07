import java.util.ArrayList;

class School {
  private String name;
  private ArrayList<Student> studentList;
  
  public School(String name) {
    this.name = name;
    studentList = new ArrayList<Student>();
  }
  
  public void appendStudent(Student student) {
    studentList.add(student);
    // System.out.printf("DEBUG: studentList.size() = %d\n", studentList.size());
    // System.out.printf("DEBUG: studentList.capacity = %d\n", studentList.capacity);
  }
  
  public boolean addStudent(int index, Student student) {
    /*
    System.out.printf("DEBUG: index = %d\n", index+1);
    studentList.ensureCapacity(index+1);
    */
    if (index < studentList.size()) {
      studentList.add(index, student);
      return true;
    } else {
      return false;
    }
  }
  
  public int getNumberOfStudents() {
    return studentList.size();
  }
  
  public void listAllStudents() {
    for (int i=0; i<studentList.size(); i++) {
      Student student = studentList.get(i);
      System.out.printf("index:%d,student:%s\n", i, student.toString());
    }

    // enhanced for loop
    /*
    for (Student student: studentList) {
      System.out.println(student.toString());
    } 
    */
    
    // lambda expression (anonymous function)
    //                    x     ->                  f(x)
    // studentList.forEach(student -> System.out.println(student.toString()));   
    
  }
  
  public int findStudent(Student student) {
    System.out.println("index 0 vs student: " + student.equals(studentList.get(0)));
    System.out.println("index 0 vs student: " + student.equals(studentList.get(1)));
  
    return studentList.indexOf(student);
    
    // actual implementation of indexOf is something like:
    /*
    int result = -1;
    for (int i=0; i<studentList.size(); i++) {
        if (student.equals(studentList.get(i)) return i;
    }
    return result;
    */
  }
}










