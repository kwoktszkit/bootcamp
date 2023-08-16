package check;

public class Student {

  String name;

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10) {
      throw new NameTooLongException("Name is too long(>10)");
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      student.setName("Peter abc abc abc bc");
    } catch (NameTooLongException e) {
      System.out.println("Nothing happen");

    }

    Student student2 = new Student();

  }

}
