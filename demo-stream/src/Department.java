public class Department {
  String name;

  public Department(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dept[" + "name=" + this.name + "]";
  }
}
