public class Student {

  String name = "abc";
  int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    String name = "hello";

    Student s1 = new Student();
    Student s2 = new Student();
    s2.setName("abcd");
    s2.setName("abc");
  }

}
