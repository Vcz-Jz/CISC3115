class Student {
  final int MAX_NUMBER_OF_COURSES = 10;
  
  static int numOfStudnetObjectCreated = 0;
  int counter = 0;
  
  int age;
  String id;
  String name;
  
  Student() {
  /*
    id = "NA";
    name = "NA";
    age = -1;
  */
  }
  
  Student(String newId, String newName, int newAge) {
    id = newId;
    name = newName;
    age = newAge;
  }
  
  void setAge(int newAge) {
    age = newAge;
  }
  
  void incrementNumOfStudentObjects() {
    numOfStudnetObjectCreated ++;
    counter ++;
  }
  
  
  void printDataFields() {
    System.out.printf("%20s.%20s = %20s\n", name, "id", id);
    System.out.printf("%20s.%20s = %20d\n", name, "age", age);  
  }
  
  static void printNumberOfStudentObjectsCreated() {
    System.out.printf("%d Student objects has been created\n", numOfStudnetObjectCreated);
    System.out.printf("counter = %d\n", counter);
  }
}
