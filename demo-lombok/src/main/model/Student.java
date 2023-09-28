
@RequiredArgsConstructor
@AllArgsConstructor
public class Student {
  private int age;

  public static void main(String[] args) {
    Student student = new Student();
    Student s2 = new Student(10);
  }
}
