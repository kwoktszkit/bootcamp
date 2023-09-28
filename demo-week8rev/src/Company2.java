import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company2 {
  private Staff[] staffs;

  public Company2() {
    staffs = new Staff[0];
  }

  public Company2(Staff[] staffs) {
    this.staffs = staffs;
  }

  public Staff[] geStaffs() {
    return this.staffs;
  }

  public void add(Staff staff) {
    Staff[] original = this.staffs;
    this.staffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < original.length; i++) {
      this.staffs[i] = original[i];
    }
    this.staffs[this.staffs.length - 1] = staff;

    public void remove(Staff staff){

      boolean found = false;

      for (int i = 0; i < this.staffs.length; i++){
       if (staffs[i].equals(staff)){
         found = true;
          }
        }  if (!found)
           return;
           Staff[] original = this.staffs;
           this.staffs = new Staff[this.staffs.length - 1];
           for (int i = 0; i < original.length; i++){
            if (i == idx)
            continue;
            this.staffs[i] = original[i];
           }
    }

    public static void main(String[] args) {
      
    }

    List<Person> persons = Arrays.stream(company.geStaffs())
        .filter(s -> s.geteSalary() > 20000)
        .map(e -> new Person(e.getName()))
        .collect(Collectors.toList());
  }
}
