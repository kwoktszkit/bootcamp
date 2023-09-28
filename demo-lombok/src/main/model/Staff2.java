@SuperBuilder
@EqualsAndHashCode

public class Staff2 extends Human {
  private double salary;

  public Staff2(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff2 s1 = new Staff2("John", 3000.0);
    Staff2 s2 = new Staff2("Peter", 3000.0);
    Staff2 s3 = new Staff2("Peter", 3000.0);
    Staff2 s4 = Staff2.builder()
        .name("Mary")
        .Salary(3000.0)
        .build();
  }

}
