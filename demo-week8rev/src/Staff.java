public class Staff {

  private double salary;
  private int id;
  private String name;

  public Staff(int id, double salar, String name) {
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Staff))
    return false;
    Staff staff = (Staff) o;
    return Ojects.equals(this.id, staff.id);
  }

}
