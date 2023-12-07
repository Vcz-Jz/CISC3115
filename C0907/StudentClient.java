class StudentClient {
  public static void main(String[] args) {
    Student john = new Student("1001", "John Doe", 99);
    Student jane = new Student("1002", "Jane Doe", 98);
    john.printDataFields();
    jane.printDataFields();

    john.printNumberOfStudentObjectsCreated();
    jane.printNumberOfStudentObjectsCreated();

    john.incrementNumOfStudentObjects();

    john.printNumberOfStudentObjectsCreated();
    jane.printNumberOfStudentObjectsCreated();

  /*
    int i = 2; 
    int j = 3;
    i = j;
    System.out.printf("i = %4d\n", i);
    System.out.printf("j = %4d\n", j);
    i = 1;
    j = 10;
    System.out.printf("i = %4d\n", i);
    System.out.printf("j = %4d\n", j);
  
  
    Student john = new Student("1001", "John Doe", 99);
    Student jane = new Student("1002", "Jane Doe", 98);
    john.printDataFields();
    jane.printDataFields();
    
    john = jane;
    System.out.println("------------ after john = jane ---------------");
    john.printDataFields();
    jane.printDataFields();
    
    jane.setAge(10);
    System.out.println("------------ after john.setAge(10); ---------------");
    john.printDataFields();
    jane.printDataFields();
    
  
  */
  
    

/*
    // Student student = new Student();
    Student student = null; // reference variable in contrast to primitive variables
    System.out.println("The value of variable student is " + student);
    //student = new Student("1001", "John Doe", 99);
    student = new Student();
    System.out.println("The value of variable student is " + student);
    student.printDataFields();
*/
  }
}
