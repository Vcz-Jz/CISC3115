class PersonClient {
  public static void main(String[] args) {
    Person person = new Person();
    Student student = new Student();
    Professor professor = new Professor();
    
    person.changeAddress("2900 Bedford Ave");
    student.changeAddress("2900 Bedford Ave");
    professor.changeAddress("2900 Bedford Ave");
    
    System.out.println(student.getName());
  }
}
