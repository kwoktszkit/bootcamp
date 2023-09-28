@EqualsAndHashCode
@AllArgsConstructor
public class Staff extends Human {
  private double salary;

  public Staff(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Staff staff = new Staff("John", 3000.0);
    Staff staff2 = new Staff("Peter", 3000.0);
    System.out.println(staff.equals(staff2));
  }
}
