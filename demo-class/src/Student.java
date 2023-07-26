public class Student {

  String firstName; // instance variables
  String lastName;
  int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

  }

  public String getfirstName() {
    return this.firstName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public int getage() {
    return this.age;
  }

  public String fullName() {
    return this.firstName.concat(this.lastName);
  }

  public boolean isAdult() {
    // if (this.age >= 18) {
    // return true;
    // return false;
    return this.age >= 18;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public void setage(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    Student A = new Student();
    String str = new String();
    A.setfirstName("Oscar");
  }

}
