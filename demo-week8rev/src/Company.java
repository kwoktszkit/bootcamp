import java.util.ArrayList;
import java.util.List;

public class Company {

  List<Staff> staffs;

  public Company() {
    staffs = new ArrayList<>();
  }

  public Company(List<Staff> staffs) {
    this.staffs = staffs;
  }

  public List<Staff> geStaffs() {
    return this.staffs;
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
    counter++;
  }

  public Staff getStaff(int staffId) {
    return this.staffs.stream()
        .filter(s -> s.getId() == staffId)
        .map(s -> s.getName())
        .findAny()
        .orElse(null);

  }

  public static void main(String[] args) {
    Company company = new Company();
    company.geStaffs().add(new Staff(1, 20000, "John"));
    company.add(new Staff(2, 10000, "Peter"));
  }

}
