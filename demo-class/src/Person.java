public class Person {
  // instance variable
  private int age;
  private char gender;
  private boolean smart;

  public void setAge(int a) {
    this.age = a + 1;
  }

  public void setGender(char g) {
    this.gender = g;
  }

  public void setSmart(boolean smart) {
    this.smart = true;
  }

  public int getAge() {
    return this.age;
  }

  public char getGender() {
    return this.gender;
  }

  public boolean getSmart() {
    return this.smart;
  }

  public static void main(String[] args) {
    String s = "abc";
    Person Adrian = new Person();
    Person Betty = new Person();
    Person Chris = new Person();
    Adrian.setAge(13);
    Betty.setGender('F');
    Chris.setSmart(true);

    if(boolean x == true){do sth;}

    if(x : do sth)

  }
}