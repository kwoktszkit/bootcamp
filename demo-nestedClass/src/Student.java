import java.util.List;

public class Student {
  String name;
  int size;
  Bag bag;

  public Student(String name) {
    this.name = name;
    bag = new Student.Bag();
  }

  public int getBagSize() {
    return this.bag.size;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  @Override
  public String toString() {
    return "Student[name=+ this" + this.name + ", Bag[" + this.bag + "]";
  }

  public static class Bag {
    int size;
    List<String> strings;

    public int getSize() {
      return new Student.Bag().getSize();
    }

    public void clearBag() {
      Bag.clear(this.bag);
    }

    public static Bag clear(Bag bag) {
      bag.strings.clear();
    }
  }

  public class Grade(){
    private int score;

    public char getGrade() {
      switch (this.score) {
        case 90:
          return 'A';
        case 80:
          return 'B';
        case 70:
          return 'c';
        default:
          return 'E';
      }
    }

    public Grade(int score) {
      this.score = score;
    }

    public void printStudentName() {
      System.out.println(Student.this.getName());
    }
  }

  public static void main(String[] args) {
    Student student = new Student();
    Student.Bag bag = new Student.Bag();
    Student.Grade grade = new Student();
  }

}
